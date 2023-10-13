package com.app.compose_components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.app.compose_components.navigation.NavGraph
import com.app.compose_components.ui.theme.Compose_ComponentsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Compose_ComponentsTheme {
                setNavigation()
            }
        }
    }

    @Composable
    fun setNavigation() {
        val onBackPressedDispatcher = this.onBackPressedDispatcher
        var navController = rememberNavController()

        Scaffold(backgroundColor = Color.White, modifier = Modifier.fillMaxSize(),
            bottomBar = {}, content = { padding ->
                ScaffoldDefaults.contentWindowInsets
                Box(modifier = Modifier.padding(padding)) {
                    NavGraph(navController = navController)
                }
            })
    }
}

@Composable
fun BasicCompose(navController: NavController) {
    LazyColumn {
        items(loadArrayList().size) {
            cardView(it)
        }
    }
}

@Composable
fun cardView(i: Int) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ), modifier = Modifier
            .padding(15.dp)
            .fillMaxSize()
    ) {
        Text("${i + 1} - ${loadArrayList()[i]}", modifier = Modifier.padding(10.dp))
    }
}