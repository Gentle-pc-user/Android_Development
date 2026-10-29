package com.example.myapplication.jetpackcompose

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


// @Preview(showBackground = true)
@Composable
fun TextExample() {
    Text(
        text = "Sourabh",
        color = Color.Cyan,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Serif
    )
}

// @Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextFieldExample() {
    var name by remember { mutableStateOf(value = "") }
    TextField(
        //label =  {Text(text = "Enter your name")},
        name,
        { name = it },
        placeholder = { Text(text = "Enter your name") },
        leadingIcon = {
            Text(
                text = "*",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },
        trailingIcon = {
            Text(
                text = "#",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },
        singleLine = true,
        // shape = RoundedCornerShape(size = 15.dp),
        shape = CircleShape,
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color.Red,
            focusedTextColor = Color.Green,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.Yellow,
            unfocusedIndicatorColor = Color.Black,
            focusedIndicatorColor = Color.Blue,
            cursorColor = Color.Magenta,
            unfocusedPlaceholderColor = Color.Gray,
            focusedPlaceholderColor = Color.Cyan,
            unfocusedLeadingIconColor = Color.Red,
            focusedLeadingIconColor = Color.Green,
            unfocusedTrailingIconColor = Color.Red,
            focusedTrailingIconColor = Color.Green,
            unfocusedLabelColor = Color.Red,
            focusedLabelColor = Color.Green
        )
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OutlinedTextFieldExample() {
    var name by remember { mutableStateOf(value = "") }

    OutlinedTextField(
        value = name,
        onValueChange = { name = it },
        label = { Text(text = "Enter your name") },
        leadingIcon = {
            Text(
                text = "*",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },
        trailingIcon = {
            Text(
                text = "#",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },
        shape = CircleShape,
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color.Red,
            focusedTextColor = Color.Green,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.Yellow,
        )


    )
}



