package com.example.myapplication.jetpackcompose.NavigationEx

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute

@Composable
fun NavGraph(modifier: Modifier = Modifier) {
    // navController -> Handle Navigation
    // rememberNavController -> Create instance of navController and remember it
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MyNavRoutes.LoginScreen // whenever the app runs which one is the first screen to show?
    ){
        composable<MyNavRoutes.LoginScreen> { // inside `< >` we specify route
            LoginScreenExample(navController)
        }

        composable<MyNavRoutes.HomeScreen> {
            HomeScreenExample(navController)
        }

        // backstackEntry is a lambda function called when rendering screen UI which has data and arguments
        // which are passed during Navigation
        composable<MyNavRoutes.WelcomeScreen>{ backStackEntry ->
            val data = backStackEntry.toRoute<MyNavRoutes.WelcomeScreen>()
            WelcomeScreenUI(data.userName, navController) // initially we get error due to we do not know the value of userName.
            // To fix this right-click on 'data.userName' and select 'Add parameter to function WelcomeScreenUI'
        }
    }
}