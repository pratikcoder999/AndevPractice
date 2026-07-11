package com.example.practice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun StateHoistingParent() {

    var count by rememberSaveable { mutableStateOf(0) }

    StateHoistingChild(
        count = count,
        increment = { count++ },
        decrement = { count-- }
    )


}


@Composable
fun StateHoistingChild(
    count : Int,
    increment : () -> Unit,
    decrement : () -> Unit,
) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Text(text = "level : $count ", fontSize = 30.sp, modifier = Modifier.padding(end = 20.dp))

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier =  Modifier
                .fillMaxWidth()
                .padding(26.dp)

        ) {

            Button(
                onClick = {

                    if (count < 5) {
                        increment()
                    }

                }
            )
            {
                Text(text = "upgrade", fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.weight(0.1f))

            Button(
                onClick = {

                    if (count > 0) {
                        decrement()
                    }

                }
            )
            {
                Text(text = "downgrade", fontSize = 20.sp)
            }
        }

    }
}

@Composable
fun stateParent(){

    var chan by rememberSaveable {mutableStateOf(0) }

    stateChild(chan = chan,
        increment = { chan++ },
        decrement = { chan-- }
    )

}

@Composable
fun stateChild(
    chan : Int,
    increment : () -> Unit,
    decrement : () -> Unit
)
{}