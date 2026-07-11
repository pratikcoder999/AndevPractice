package com.example.basiccomposables.jetpackcompose


import android.R.attr.end
import android.R.attr.onClick
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build

import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice.R


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun UI_practice() {
    
    val YellowOchre = Color(0xFFCB9D06)
    var Phone by remember{ mutableStateOf("") }
    var Password by remember{ mutableStateOf("") }


    Box(
        modifier = Modifier.fillMaxWidth()
            .background(color = YellowOchre)
            .padding(79.dp),

        contentAlignment = Alignment.Center
    ){
            Image(
                painter = painterResource(R.drawable.autobots_logo),
                contentDescription = "Logo",
                modifier = Modifier.size(size = 80.dp)
            )
    }

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(0.dp, 239.dp, 0.dp, 0.dp)
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {

        OutlinedTextField(
            value = Phone,
            onValueChange = { Phone = it },
            placeholder = { Text(text = "Enter your Gmail or Phone no.") },
            singleLine = true,

            modifier = Modifier.fillMaxWidth().padding(16.dp, bottom = 26.dp, end = 16.dp),
            colors = OutlinedTextFieldDefaults.colors(
                cursorColor = Color.White,
                focusedTextColor = Color.White
            ),
            textStyle = LocalTextStyle.current.copy(fontSize = 23.sp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = Password,
            onValueChange = { Password = it },
            placeholder = { Text(text = "Enter your Password") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth().padding(16.dp, bottom = 116.dp, end = 16.dp),
            colors = OutlinedTextFieldDefaults.colors(
                cursorColor = Color.White,
                focusedTextColor = Color.White
            ),
            textStyle = LocalTextStyle.current.copy(fontSize = 23.sp)
        )

        TextButton(
            onClick = {},
            modifier = Modifier.align(Alignment.End).padding(end = 8.dp)
        ) {
            Text(text = "Forgot Password?", color = YellowOchre, fontSize = 19.sp)
        }

        Spacer(modifier = Modifier.height(10.dp))

        var openDialog by remember { mutableStateOf(false) }

        val context = LocalContext.current

        Button(
            onClick = { openDialog = true },
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
                .height(50.dp),
            //shape = ButtonDefaults.elevatedShape,
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White,
            ),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 36.dp),
            border = BorderStroke(1.dp, YellowOchre)
        ) {
            Row() {
                Icon(imageVector = Icons.Default.Build, contentDescription = "Add")
                Spacer(modifier = Modifier.width(15.dp))
                Text(text = "Click to modify")
            }
        }

        if (openDialog) {
            AlertDialog(
                onDismissRequest = { openDialog = false },

                title = { Text(text = "UI Modification", fontSize = 35.sp, fontWeight = FontWeight.Bold) },

                text = { Text(text = "Are you sure you want to modify the UI?", fontSize = 25.sp, lineHeight = 30.sp)
                },

                confirmButton = {

                    Button(
                        onClick = {
                        openDialog = false
                        Toast.makeText(context, "Modification Successful", Toast.LENGTH_SHORT).show()
                    },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
                    ){
                        Text(text = "Yes")
                    }

                },

                 dismissButton =  {

                     Button(
                         onClick = { openDialog = false },
                         colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray, contentColor = Color.DarkGray)
                     ){
                         Text(text = "No")
                     }

                 }
            )
        }
    }
}
