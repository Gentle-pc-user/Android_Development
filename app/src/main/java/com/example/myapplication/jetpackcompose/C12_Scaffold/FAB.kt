package com.example.myapplication.jetpackcompose.C12_Scaffold

import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FAB() {

    FloatingActionButton(onClick = {},
        containerColor = Color(color = 0xFFDECA88)) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Add"
        )
    }
}