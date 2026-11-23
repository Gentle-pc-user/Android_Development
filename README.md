# RoomInSight 🏠📱

> **Spatial intelligence at your fingertips, mapping every corner of your room in real time.**

**RoomInSight** is an on-device Android computer vision application built with **Kotlin**, **Jetpack Compose**, **CameraX**, and **ONNX Runtime Mobile**. It uses a custom-distilled **YOLOv26n** object detection model to detect indoor furniture in real time, record room scan sessions, and automatically tabulate object counts per scan.

---

## ✨ Key Features

- **Real-Time Indoor Object Detection:** Live camera feed powered by CameraX (`Preview` + `ImageAnalysis`) running low-latency, offline inference via ONNX Runtime Mobile.
- **Custom Bounding-Box Overlays:** Reactive Jetpack Compose `Canvas` overlays highlighting detected indoor furniture classes in real time with confidence scores and Non-Maximum Suppression (NMS) filtering.
- **Video Scan Recording:** Integrated CameraX `VideoCapture` pipeline with Play/Stop recording controls, saving `.mp4` scan sessions locally for review.
- **Session History & Object Counting:**
  - **Recent Detections:** Stores and lists recorded room scan videos locally.
  - **Detected Objects Summary:** Automatically aggregates and displays object counts from the user's latest recorded scan.
- **Lightweight Edge Footprint:** Powered by a **5.4 MB** distilled ONNX student model (`best.onnx`), enabling smooth performance on mobile hardware without cloud dependencies.

---

## 🧠 Machine Learning & Distillation Pipeline

The object detection model powering RoomInSight was trained end-to-end using PyTorch and Ultralytics YOLO:

1. **Custom Dataset Curation:** Collected indoor furniture images across diverse room lighting and angles from mobile camera captures, carpentry archives, and web sources.
2. **Annotation & Splitting:** Labeled bounding boxes and partitioned the dataset into training (150 images), validation (30 images), and test splits using **Roboflow**[cite: 2, 3].
3. **Data Augmentation:** Applied PyTorch `torchvision.transforms.v2` (`RandomHorizontalFlip`, `RandomRotation`, `RandomResizedCrop`, `ColorJitter`) alongside YOLO `Mosaic` and `MixUp` augmentations[cite: 3].
4. **Evolutionary Hyperparameter Tuning:** Executed Ultralytics' automated genetic algorithm (`model.tune()`) over multiple evolution cycles to extract optimal learning rate, momentum, and loss gain hyperparameters into `best_hyperparameters.yaml`[cite: 3].
5. **Teacher-Student Knowledge Distillation:**
   - **Teacher Model (`YOLOv26x`):** Trained the high-capacity 58.8M-parameter teacher model using the tuned hyperparameters to capture rich spatial representations[cite: 3].
   - **Student Model (`YOLOv26n`):** Distilled knowledge from the teacher weights into a compact nano architecture, achieving **0.577 mAP@50**.
6. **ONNX Export & Simplification:** Exported the trained student weights into a simplified **5.4 MB** `best.onnx` binary for mobile execution.

---

## 🛠️ Tech Stack

| Layer | Technologies |
| :--- | :--- |
| **Language** | Kotlin |
| **UI Framework** | Jetpack Compose, Material 3, Custom Canvas |
| **Camera & Media** | AndroidX CameraX (`camera-core`, `camera-camera2`, `camera-lifecycle`, `camera-view`, `camera-video`) |
| **On-Device ML** | ONNX Runtime Mobile (`onnxruntime-android`) |
| **Architecture & DI** | MVVM, Koin (`koin-android`, `koin-androidx-compose`), Accompanist Permissions |
| **Model Training** | PyTorch, Ultralytics YOLO (v26x / v26n), Roboflow |

---

## 📂 Project Structure

```text
Android_Development/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── assets/
│   │   │   │   └── best.onnx              # Distilled 5.4 MB YOLOv26n ONNX model
│   │   │   ├── java/com/example/roominsight/
│   │   │   │   ├── di/                    # Koin dependency injection modules
│   │   │   │   ├── ml/                    # YoloDetector, preprocessing, tensor inference & NMS
│   │   │   │   ├── ui/                    # Jetpack Compose screens, CameraX preview & overlays
│   │   │   │   ├── MainActivity.kt        # Entry point & runtime camera permission handling
│   │   │   │   └── RoomMapperApp.kt       # Application class initializing Koin
│   │   │   └── AndroidManifest.xml        # Camera & storage hardware declarations
│   └── build.gradle.kts                   # App dependencies (CameraX, ONNX, Compose, Koin)
└── gradle/
    └── libs.versions.toml                 # Centralized dependency version catalog
