package com.example.monresto.ui.composable

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun Home(){
    Scaffold(
        topBar = { TopAppBarComposable() },
        content = { paddingValues -> HomeScreen(paddingValues = paddingValues)  }
    )
}