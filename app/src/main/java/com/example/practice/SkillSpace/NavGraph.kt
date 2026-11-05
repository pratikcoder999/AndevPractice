package com.example.practice.SkillSpace

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph() {

    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    // Check if the current destination is the PlayPreview screen
    val isPlayPreview = currentDestination?.hasRoute<NavRoutes.PlayPreview>() == true

    Scaffold(
        topBar = { if (!isPlayPreview) AppTopBar() },
        bottomBar = { if (!isPlayPreview) AppBottomBar(navController = navController) },
        floatingActionButton = { if (!isPlayPreview) FAB() }
    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = NavRoutes.HomeScreen,
            // Apply padding only if it's NOT the full-screen PlayPreview
            modifier = Modifier.padding(innerPadding)
        ) {

            composable<NavRoutes.HomeScreen> {
                HomeScreen(navController)
            }

            composable<NavRoutes.Resources> {
                Resources(navController)
            }

            composable<NavRoutes.Schedule> {
                Schedule(navController)
            }

            composable<NavRoutes.TrendList> {
                TrendList(navController)
            }

            composable<NavRoutes.PlayPreview> {
                val samplePlaylist = SkillTrackPlaylist(
                    trackTitle = "Android Development",
                    playlistName = "Jetpack Compose for Beginners",
                    thumbnailUrl = "",
                    progress = 0.35f,
                    videos = listOf(
                        PlaylistVideo("Introduction to Compose", "12:45", true),
                        PlaylistVideo("Layouts and Modifiers", "25:10", true),
                        PlaylistVideo("State Management", "45:20"),
                        PlaylistVideo("Navigation in Compose", "18:30"),
                        PlaylistVideo("Working with Side Effects", "30:00"),
                        PlaylistVideo("Theming and Styling", "22:15")
                    )
                )
                PlaylistPreview(
                    playlist = samplePlaylist,
                )
            }
        }
    }
}
