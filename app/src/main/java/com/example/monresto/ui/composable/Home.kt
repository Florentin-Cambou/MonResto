package com.example.monresto.ui.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.monresto.data.DataService
import com.example.monresto.model.Screens

@Composable
fun Home(){
    //Creation du navigationController
    val navController = rememberNavController()
    //Puisse voir sur quel menu nous sommes
    var menu by remember { mutableStateOf(DataService().americain) }
    //Avoir un backstackEntry
    val backStackEntry by navController.currentBackStackEntryAsState()
    //Voir la screen actuelle
    val currentScreen = Screens.valueOf(backStackEntry?.destination?.route?: Screens.Home.title)

    Scaffold(
        topBar = { TopAppBarComposable(canGoBack = currentScreen != Screens.Home, screens = currentScreen, up = {navController.navigateUp()} ) },
        content = { paddingValues ->
            NavHost(
                navController = navController,
                startDestination = Screens.Home.title,
                modifier = Modifier.padding(paddingValues)
            ){
                composable(route = Screens.Home.name){
                    HomeScreen(
                        paddingValues = paddingValues,
                        onClick = {
                                newMenu -> menu = newMenu
                            navController.navigate(route = Screens.Entree.name)
                        })
                }
                composable(route = Screens.Entree.name){
                    DetailView(article = menu.entree, btnTitle = "Vers les plats", onClick = {
                        navController.navigate(route = Screens.Plat.name)
                    })
                }
                composable(route = Screens.Plat.name){
                    DetailView(article = menu.plat, btnTitle = "Vers les desserts", onClick = {
                        navController.navigate(route = Screens.Dessert.name)
                    })
                }
                composable(route = Screens.Dessert.name){
                    DetailView(article = menu.dessert, btnTitle = "Vers les menus", onClick = {
                        navController.popBackStack(Screens.Home.name, inclusive = false)
                    })
                }
            }
        }
    )
}