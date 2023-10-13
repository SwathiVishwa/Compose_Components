package com.app.compose_components.navigation

sealed class NavRoute(val route: String) {
    object BasicComposeRoute : NavRoute("basic_compose_route")
    object BasicUiRoute : NavRoute("basic_ui_route")
    object SelectionRoute : NavRoute("selection_route")
    object LazyRowRoute : NavRoute("lazy_row_route")
}