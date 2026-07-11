package com.example.practice.Navigation_bar

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun NavBarNavigation() {

    val navController = rememberNavController()

     NavHost(
         navController = navController,
         startDestination = Routes.Home
     ){

         composable<Routes.Home> {
             NavHomeScreen(navController)
         }

         composable<Routes.Notification>{
             NotificationScreen(navController)
         }

         composable<Routes.Profile> {
             SearchScreen(navController)
         }

         composable<Routes.Search> {
             ProfileScreen(navController)
         }

     }

}