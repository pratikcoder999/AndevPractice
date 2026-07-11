package com.example.practice.Navigation_bar

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {

    @Serializable
    object Home : Routes()

    @Serializable
    object Profile : Routes()

    @Serializable
    object Search : Routes()

    @Serializable
    object Notification : Routes()

}