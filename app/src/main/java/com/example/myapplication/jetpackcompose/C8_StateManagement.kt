package com.example.myapplication.jetpackcompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

// @Preview(showBackground = true, showSystemUi = true)
@Composable
fun StateManagementExample() {
    /* 'recomposition': Whenever a value changes it re-renders the specific part
    of UI this process called recomposition
    */
    // `remember` keeps this value during recomposition
    var score by remember {mutableStateOf(value = 0)} // initial value is 0
    /* `mutableStateOf` hold a value that can change & used to trigger
    recomposition when value changes
    */
    // `by` is used to get and set the value

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Score: $score",
            fontSize = 30.sp)

        Row() {
            Button(
                onClick = {score++},
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Increase")
            }

            Spacer(modifier = Modifier.width(width = 8.dp))

            Button(
                onClick = {score--},
                modifier = Modifier.weight(1f),
                enabled = score > 0 // `enabled` is used to apply condition.
                // Button is enabled if and only if the score is greater than zero.
            ) {
                Text(text = "Decrease")
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RememberSavableExample() {
    // `rememberSaveable` saves the state during configuration changes. Such as dark theme on and off
    var score by rememberSaveable {mutableStateOf(value = 0)} // initial value is 0
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Score: $score",
            fontSize = 30.sp)

        Row() {
            Button(
                onClick = {score++},
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Increase")
            }

            Spacer(modifier = Modifier.width(width = 8.dp))

            Button(
                onClick = {score--},
                modifier = Modifier.weight(1f),
                enabled = score > 0 // `enabled` is used to apply condition.
                // Button is enabled if and only if the score is greater than zero.
            ) {
                Text(text = "Decrease")
            }
        }

    }
}

@Composable
fun StateHostingParent() {
    var score by remember {mutableStateOf(value = 0)}

    CounterChild(
        score = score,
        increment = {score++},
        decrement = {score--}
    )
}

@Composable
fun CounterChild(
    score: Int,
    increment: () -> Unit,
    decrement: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Score: $score",
            fontSize = 30.sp)

        Row() {
            Button(
                onClick = {increment()},
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Increase")
            }

            Spacer(modifier = Modifier.width(width = 8.dp))

            Button(
                onClick = {decrement()},
                modifier = Modifier.weight(1f),
                enabled = score > 0 // `enabled` is used to apply condition.
                // Button is enabled if and only if the score is greater than zero.
            ) {
                Text(text = "Decrease")
            }
        }

    }
}