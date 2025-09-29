package com.zenfit.ai.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.zenfit.ai.ui.screens.home.HomeScreen

@Composable
fun ZenFitNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(navController = navController)
        }
    }
}

sealed class Screen(val route: String) {
    object Home : Screen("home")
}