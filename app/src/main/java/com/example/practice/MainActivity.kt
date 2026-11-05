package com.example.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccomposables.jetpackcompose.Nested_LazyColumn_in_LazyRow
import com.example.basiccomposables.jetpackcompose.UI_practice
import com.example.practice.Navigation_bar.NavBarNavigation
import com.example.practice.Navigation_bar.NavHomeScreen
import com.example.practice.Navigation_bar.NavigationBar
import com.example.practice.Scaffold.Screen
import com.example.practice.SkillSpace.HomeScreen
import com.example.practice.SkillSpace.NavGraph
import com.example.practice.ui.theme.PracticeTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            PracticeTheme {
                //Test()
                //State()
                //Joker()
                //Lazy()
                //Login_ui()
                //UI_practice()
                //StateHoistingParent()
                //Nested_LazyColumn_in_LazyRow()
                //Screen()
                //HomeScreen()
                //NavBarNavigation()

                NavGraph()

            }
        }
    }
}


