package com.example.navigasilayout

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasilayout.view.Formulir
import com.example.navigasilayout.view.HomeScreen
import com.example.navigasilayout.view.TampilData

enum class Navigasi {
    HomeScreen,
    DataPeserta,
    Formulir
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold { isiRuang->
        NavHost(navController = navController,
                startDestination = Navigasi.HomeScreen.name,
                modifier = Modifier.padding(isiRuang))
        {
            composable(route = Navigasi.HomeScreen.name) {
                HomeScreen(
                    OnToFormBtnClick = {
                        navController.navigate(Navigasi.Formulir.name)
                    }
                )}
            composable(route = Navigasi.DataPeserta.name) {
                TampilData(
                    OnToFormBtnClick = {
                        navController.popBackStack()
                    },
                    OnToHomeBtnClick = {
                        navController.navigate(Navigasi.HomeScreen.name) {
                            popUpTo(Navigasi.HomeScreen.name) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    }
                )
            }
            composable(route = Navigasi.Formulir.name) {
                Formulir(
                    OnSubmitButtonClick = {
                        navController.navigate(Navigasi.DataPeserta.name)
                    }
                )
            }
        }
    }
}