package com.example.myapplication.jetpackcompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Alignment
import com.example.myapplication.R
import androidx.compose.foundation.Image
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

// @Preview(showBackground = true, showSystemUi = true)
@Composable
fun ImageExample() {
    Image(

        painter = painterResource(R.drawable.mavuika),
        contentDescription = "mavuika",
        modifier = Modifier
            .padding(all = 16.dp)
            //.clip(shape = CircleShape)
            .size(300.dp, 500.dp)
            .clip(shape = RoundedCornerShape(size = 16.dp)),
        // contentScale = ContentScale.Fit // fit inside defined height and width
        // contentScale = ContentScale.Crop // crop image to fit inside defined height and width
        contentScale = ContentScale.FillBounds // fill the defined height and width

    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun IconExample() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Person Icon",
            modifier = Modifier.size(size = 100.dp),
            tint = Color.Red
        )
    }

}

