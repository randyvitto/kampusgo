package com.sgu.kampusgo

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun KampusNav(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "events",
        modifier = modifier
    ) {
        composable("notes") {
            NotesScreen()
        }
        composable("events") {
            EventsScreen(onEventClick = { id -> navController.navigate("event/$id") })
        }
    }
}