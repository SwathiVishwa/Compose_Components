package com.app.compose_components.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.compose_components.BasicCompose
import com.app.compose_components.ui.screens.BasicUIViewScreen
import com.app.compose_components.ui.screens.LazyRowScreen
import com.app.compose_components.ui.screens.SelectionScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.BasicComposeRoute.route
    ) {
        composable(route = NavRoute.BasicComposeRoute.route) {
            BasicCompose(navController)
        }
        composable(route = NavRoute.BasicUiRoute.route) {
            BasicUIViewScreen(navController)
        }
        composable(route = NavRoute.SelectionRoute.route) {
            SelectionScreen(navController)
        }
        composable(route = NavRoute.LazyRowRoute.route) {
            LazyRowScreen(navController)
        }
    }
}