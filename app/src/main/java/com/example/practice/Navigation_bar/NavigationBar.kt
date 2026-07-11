package com.example.practice.Navigation_bar

import android.R.attr.icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController



@Composable
fun NavigationBar(navController: NavHostController, Key: String) {

    val navItems = listOf(
        NavItem("Home", Icons.Default.Home, Routes.Home),
        NavItem("Search", Icons.Default.Search, Routes.Search),
        NavItem("Profile", Icons.Default.Person, Routes.Profile),
        NavItem("Notification", Icons.Default.Notifications, Routes.Notification)
    )

    NavigationBar {

        navItems.forEach { item ->

            NavigationBarItem(
                selected = item.title == Key,

                onClick = {
                    navController.navigate(item.routes) {
                        popUpTo(navController.graph.startDestinationId){
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },

                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = "Home"
                    )
                },

                label = { Text(text = item.title) },
                alwaysShowLabel = true,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Blue,
                    selectedTextColor = Color.Blue,
                    unselectedIconColor = Color.DarkGray,
                    unselectedTextColor = Color.DarkGray,
                )
            )

        }
    }
}

data class NavItem(
    val title: String,
    val icon: ImageVector,
    val routes: Routes
)

