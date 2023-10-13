package com.app.compose_components.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.compose_components.BasicCompose

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.BasicComposeRoute.route
    ) {
        composable(route = NavRoute.BasicComposeRoute.route) {
            BasicCompose(navController)
        }
    }
}