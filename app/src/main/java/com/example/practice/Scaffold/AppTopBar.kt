package com.example.practice.Scaffold


import android.R
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SearchBarDefaults.colors
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppTopBar() {

    val Violet = Color(0xFF7F00FF)

    TopAppBar(

        title = {
         Text(
             text = "Practice App",
             fontSize = 24.sp,
             fontWeight = FontWeight.Bold,
             modifier = Modifier.padding(start = 52.dp)
             )

        },

        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }){
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu"
                )
            }
        },

        actions = {

            IconButton(onClick = { /*TODO*/ }){
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search"
                )
            }

            IconButton(onClick = { /*TODO*/ }){
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "MoreVert"
                )
            }

        },

        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Violet,
            titleContentColor = Color.Black,
            navigationIconContentColor = Color.Black,
            actionIconContentColor = Color.Black
        )

    )

}