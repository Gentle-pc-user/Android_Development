package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.jetpackcompose.NavigationEx.LoginScreenExample
import com.example.myapplication.jetpackcompose.NavigationEx.NavGraph
import com.example.myapplication.jetpackcompose.NavigationEx.BasicPractice2
import com.example.myapplication.jetpackcompose.C13_Navigation_Bar.NavBarNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                NavBarNavigation()
            }
        }
    }
}

