package com.example.practice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


data class Contact(
    val name : String,
    val phoneNumber : String
)

@Preview
@Composable
fun Lazy() {

    val contacts = remember {
        listOf(
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
        )
    }

//    LazyRow(
//        modifier = Modifier.fillMaxSize(),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.Center
//    )

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )

    {
        items(contacts) { contact ->

            Card(
//                modifier = Modifier.fillMaxWidth().padding(16.dp)
                modifier = Modifier.fillMaxSize().padding(16.dp)
            ){
                Column{
                    Text(text = contact.name)
                    Text(text = contact.phoneNumber)
                }
            }

        }
    }
}