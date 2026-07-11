package com.example.basiccomposables.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LazyLists() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 36.dp,horizontal = 13.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
    )
    {
        items(count = 17) { index ->
            Text(text = "Model $index", fontSize = 20.sp, fontWeight = FontWeight.Bold)

            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                items(count = 15){ index->

                    Box(modifier = Modifier.size(100.dp)
                                           .background(
                                               color = Color.LightGray,
                                               shape = RoundedCornerShape(8.dp)
                                           )
                        .padding(16.dp) // Padding between box and text inside the bo
                    ){
                        Text(text = "Testcase $index")
                    }

                }
            }
        }
    }
}

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Nested_LazyColumn_in_LazyRow() {

    LazyRow(
        modifier = Modifier.padding(horizontal = 18.dp, vertical = 15.dp)
            .fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        item {

            LazyColumn(modifier = Modifier.padding(end = 28.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                item{ Text(
                    text = "Trending",
                    fontSize = 30.sp ,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 14.dp)
                )
                }

                items(count = 35){ idx->
                    Text(text = "UI - ${idx+1}", fontSize = 25.sp,)
                }
            }


            LazyColumn(modifier = Modifier.padding(end = 28.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                item{ Text(
                    text = "For You",
                    fontSize = 30.sp ,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 14.dp)
                )
                }

                items(count = 35){ idx->
                    Text(text = "UI - ${idx+1}", fontSize = 25.sp,)
                }
            }



            LazyColumn(modifier = Modifier.padding(end = 28.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                item{ Text(
                    text = "New Releases",
                    fontSize = 30.sp ,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 14.dp )
                )
                }

                items(count = 35){ idx->
                    Text(text = "UI - ${idx+1}", fontSize = 25.sp,)
                }
            }


            LazyColumn(modifier = Modifier.padding(end = 28.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                item{ Text(
                    text = "Editor's Choice",
                    fontSize = 30.sp ,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 14.dp )
                )
                }

                items(count = 35){ idx->
                    Text(text = "UI - ${idx+1}", fontSize = 25.sp)
                }
            }
        }
    }
}