package com.example.myapplication.jetpackcompose.NavigationEx

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import com.example.myapplication.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BasicPractice2() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(13.dp, 16.dp, 13.dp, 13.dp)

    ) {
        items(count =  2) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Hello Sourabh",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White,
                        fontFamily = FontFamily.SansSerif
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.wave),
                        contentDescription = "Wave",
                        modifier = Modifier
                            .padding(start = 8.dp)
                            .size(25.dp),
                        tint = Color.Unspecified
                    )
                }

                Row() {
                    Text(
                        text = "Rise and shine",
                        fontSize = 20.sp,
                        color = Color.White,
                        fontFamily = FontFamily.SansSerif
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.sun),
                        contentDescription = "Sun",
                        modifier = Modifier
                            .padding(start = 8.dp)
                            .size(25.dp),
                        tint = Color.Unspecified
                    )

                }


            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp)
            ) {
                Text(
                    text = "Today's Free Pick",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.cyberpunkgruvbox),
                    contentDescription = "Cyber Punk",
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(size = 16.dp))

                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                Text(
                    text = "The Selfish Gene",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {
                Text(
                    text = "Richard Dawkins",
                    fontSize = 15.sp,
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif
                )
            }

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {

                Row(
                    modifier = Modifier.padding(top = 16.dp)

                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.headphonesymbol),
                        contentDescription = "Headphone",
                        modifier = Modifier
                            .size(20.dp),
                        tint = Color.White
                    )

                    Text(
                        text = "53 min",
                        color = Color.White,
                        modifier = Modifier.padding(start = 10.dp, top = 3.dp),
                        fontSize = 15.sp
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = "Star",
                        modifier = Modifier
                            .padding(start = 8.dp)
                            .size(20.dp),
                        tint = Color.White
                    )

                    Text(
                        text = "4.0",
                        color = Color.White,
                        modifier = Modifier.padding(start = 10.dp, top = 3.dp),
                        fontSize = 15.sp
                    )
                }
            }

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(top = 30.dp)
                ) {
                    Text(
                        text = "Daily Learning Sessions",
                        fontSize = 20.sp,
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                LazyRow(
                    modifier = Modifier.padding(top = 16.dp)
                ) {
                    items(count = 3) {
                        Card(
                            modifier = Modifier
                                .width(115.dp)
                                .height(150.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(color = 0xFF002D4E)
                            ),
                            border = BorderStroke(2.dp, Color.White)

                        ) {

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 8.dp, start = 15.dp)
                            ) {

                                Box(
                                    modifier = Modifier
                                        .size(width = 90.dp, height = 120.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "Avoid debt, spend less than you earn, and never let money become..",
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = Color(color = 0xFF91B6FA),
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier.align(Alignment.Center)
                                    )
                                }
                            }

                            Column(
                                modifier = Modifier.fillMaxSize().padding(start = 23.dp, bottom = 4.dp, end = 16.dp)
                            ) {
                                Text(
                                    text = "~P. T. Barnum",
                                    fontSize = 13.sp,
                                    color = Color(color = 0xFF91B6FA)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(width = 10.dp))

                        Card(
                            modifier = Modifier
                                .width(115.dp)
                                .height(150.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(color = 0xFF003441)
                            ),
                            border = BorderStroke(2.dp, Color.White)

                        ) {

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 8.dp, start = 15.dp)
                            ) {

                                Box(
                                    modifier = Modifier
                                        .size(width = 90.dp, height = 120.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "Capital grows not through passive saving, but through active investment",
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = Color(color = 0xFF91F6FE),
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier.align(Alignment.Center)
                                    )
                                }
                            }
                            Column(
                                modifier = Modifier.fillMaxSize().padding(start = 39.dp, bottom = 4.dp)
                            ) {
                                Text(
                                    text = "~J. Keynes",
                                    fontSize = 13.sp,
                                    fontStyle = FontStyle.Italic,
                                    color = Color(color = 0xFF91F6FE)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(width = 10.dp))

                        Card(
                            modifier = Modifier
                                .width(115.dp)
                                .height(150.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(color = 0xFF5E1415)
                            ),
                            border = BorderStroke(2.dp, Color.White)

                        ) {

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 8.dp, start = 15.dp)
                            ) {

                                Box(
                                    modifier = Modifier
                                        .size(width = 90.dp, height = 120.dp)
                                ) {
                                    Text(
                                        text = "Without free will, we lose the justification for the hatred and gain true human...",
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = Color(color = 0xFFFE9B95),
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier.align(Alignment.Center)
                                    )
                                }
                            }
                            Column(
                                modifier = Modifier.fillMaxSize().padding(start = 8.dp, bottom = 4.dp)
                            ) {
                                Text(
                                    text = "~Robert Sapolsky",
                                    fontSize = 13.sp,
                                    color = Color(color = 0xFFFE9B95)
                                )
                            }
                        }
                    }

                }
            }

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
                ) {
                    Text(
                        text = "Keep listening",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 5.dp, top = 16.dp, end = 5.dp)
                        .height(height = 100.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Gray
                    )
                ) {

                    Box(
                        modifier = Modifier.fillMaxSize().width(width = 80.dp)
                    ) {
                        Text(
                            text = "The Power of Your Subconscious MIND",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )
                    }

                }
            }
        }

    }
}