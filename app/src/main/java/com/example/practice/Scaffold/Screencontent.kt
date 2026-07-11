package com.example.practice.Scaffold

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccomposables.jetpackcompose.LazyLists

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Content() {

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
    ){
        items(count = 14){

            Card(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                shape = RoundedCornerShape(12.dp),
                colors = cardColors(
                    containerColor = Color.LightGray,
                    contentColor = Color.Black,
                ),
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                )
                {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.size(90.dp)
                            .background(Color.Gray, CircleShape),
                    )
                    {
                        Icon(
                            imageVector = Icons.Default.MailOutline,
                            contentDescription = "Add",
                            Modifier.size(70.dp),
                        )
                    }
                    Column() {
                        Text(
                            text = "Ktor",
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start = 13.dp)
                        )

                        Text(
                            text = "Updates Available",
                            fontSize = 22.sp,
                            modifier = Modifier.padding(13.dp)
                        )
                    }
                }
            }

        }
    }

}