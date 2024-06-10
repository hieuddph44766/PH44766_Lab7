package com.example.ph44766_lab7.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ph44766_lab7.screens.FilmScreen
import com.example.ph44766_lab7.screens.LoginScreen

@Composable
fun ScreenNav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.LOGIN.route) {
        composable(Screens.LOGIN.route) {
            LoginScreen(navController = navController)
        }
        composable(Screens.MOVIE_SCREEN.route) {
            FilmScreen(navController = navController)
        }
    }
}