package com.example.myapplication.jetpackcompose.NavigationEx

import kotlinx.serialization.Serializable

// sealed class is special type of class where we define limited number of child class
// Sealed class creates a restricted hierarchy, so its subclass can only be defined in the same file.
// Each subclass of sealed class can have its own properties and methods but all of them should be defined in the same file.
@Serializable
sealed class MyNavRoutes {
    // when we transfer a value from login screen to home screen, we have to define the route in `data class` for login screen file
    // When we just want to travel from one screen to another without transferring data or value, just use `object`
    @Serializable
    object LoginScreen : MyNavRoutes() // specify that 'LoginScreen.kt' is subclass of MyNavRoutes class
    @Serializable
    object HomeScreen : MyNavRoutes()

    @Serializable
    data class WelcomeScreen(val userName: String) : MyNavRoutes()
}