package com.app.compose_components.navigation

sealed class NavRoute(val route: String) {
    object BasicComposeRoute : NavRoute("basic_compose_route")
}