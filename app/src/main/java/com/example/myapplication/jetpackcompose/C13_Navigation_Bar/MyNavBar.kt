package com.example.myapplication.jetpackcompose.C13_Navigation_Bar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.navigation.NavHostController


@Composable
fun MyNavBar(navController: NavHostController, key: String) {

    val navItems = listOf(
        NavItem("Home", Icons.Default.Home, NavBarRoutes.Home),
        NavItem("Search", Icons.Default.Search, NavBarRoutes.Search),
        NavItem("Notification", Icons.Default.Notifications, NavBarRoutes.Notification),
        NavItem("Profile", Icons.Default.Person, NavBarRoutes.Profile)
    )

    NavigationBar{

        navItems.forEach {item ->
            NavigationBarItem(
                selected = item.title == key,
                onClick = {
                    navController.navigate(route = item.routes) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true // If user clicks on profile page multiple times, it should not create multiple instances of profile page
                        restoreState =  true // If user returns to profile page, it restores that profile page from backstack
                    }
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        "Home"
                    )
                },
                label = {
                    Text(
                        text = item.title
                    )
                },
                alwaysShowLabel = true, // try setting 'false' once
                colors = NavigationBarItemDefaults.colors(
                    selectedTextColor = Color.Blue,
                    selectedIconColor = Color.Blue,
                    indicatorColor = Color.Blue.copy(alpha = 0.3f),
                    unselectedTextColor = Color.DarkGray,
                    unselectedIconColor = Color.DarkGray
                )
            )
        }

        /**/
    }

}

data class NavItem(
    val title: String,
    val icon: ImageVector,
    val routes: NavBarRoutes
)