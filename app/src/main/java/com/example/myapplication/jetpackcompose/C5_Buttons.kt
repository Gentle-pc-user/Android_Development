package com.example.myapplication.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextButton
import androidx.compose.material3.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import android.widget.Toast
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


// @Preview(showBackground = true, showSystemUi = true)
@Composable
fun ButtonExample() {
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {Toast.makeText(context, "Button clicked!", Toast.LENGTH_SHORT).show()},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Blue,
                containerColor = Color.Green
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 20.dp
            ),
            border = BorderStroke(2.dp, Color.Blue)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Person icon"
                )

                Spacer(modifier = Modifier.width(width = 16.dp))

                Text(text = "Click me")

            }

        }
    }

}

// @Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    var userName by remember {mutableStateOf(value = "")}
    var email by remember {mutableStateOf(value = "")}

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login Here",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(height = 30.dp))

        OutlinedTextField(
            value = userName,
            onValueChange = {userName = it},
            modifier = Modifier.fillMaxWidth(),
            placeholder = {Text(text = "Username")}
        )

        Spacer(modifier = Modifier.height(height = 16.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {email= it},
            modifier = Modifier.fillMaxWidth(),
            placeholder = {Text(text = "Email")}
        )

        Spacer(modifier = Modifier.height(height = 16.dp))

        Button(
            onClick = {Toast.makeText(context, "Button clicked!", Toast.LENGTH_SHORT).show()},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Black
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 20.dp
            ),
            border = BorderStroke(2.dp, Color.Blue),
            enabled = userName.isNotEmpty() && email.isNotEmpty()
        ) {

            Text(text = "Login", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)

        }
    }
}

// @Preview(showBackground = true, showSystemUi = true)
@Composable
fun OutlinedButtonExample() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        OutlinedButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Black
            )
        ) {
            Text(text = "Click Me")
        }
    }

}

// @Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextButtonExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextButton(
            onClick = {},
        ) {
            Text(text = "Forgot Password")
        }

        // Option
        Text(text = "Forget Password",
            modifier = Modifier.clickable(onClick = {}))
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun IconButtonExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        IconButton(
            onClick = {}
        ){
            Icon(imageVector = Icons.Default.Home,
                contentDescription = "Go to Home"
            )
        }
        // Option
        Icon(imageVector = Icons.Default.Home,
            contentDescription = "Go to Home",
            modifier = Modifier.clickable(onClick = {})
        )
    }
}



