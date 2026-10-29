package com.example.myapplication.jetpackcompose.C12_Scaffold

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.IconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBarDefaults

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.font.FontWeight

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppTopBar() {

    TopAppBar(
        title = {
            Text(
                text = "Flower feather clan",
                fontWeight = FontWeight.SemiBold
            )
        },

        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Menu,
                    contentDescription = "Menu")
            }
        },

        actions = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Search,
                    contentDescription = "Search")
            }

            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.MoreVert,
                    contentDescription = "MoreVert")
            }
        },

        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(color = 0xFF374498),
            titleContentColor = Color.White,
            actionIconContentColor = Color.White,
            navigationIconContentColor = Color.White
        )
    )
}