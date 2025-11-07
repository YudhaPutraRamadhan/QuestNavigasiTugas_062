package com.example.navigasilayout

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    HomeScreen,
    DataPeserta,
    Formulir
}

@Composable
fun NavigasiApp(navController: NavHostController = rememberNavController())
{
    NavHost(navController = navController, startDestination = Navigasi.HomeScreen.name)
    {
        composable(route = Navigasi.HomeScreen.name) {
        }
        composable(route = Navigasi.DataPeserta.name) {
        }
        composable(route = Navigasi.Formulir.name) {
        }
    }
}