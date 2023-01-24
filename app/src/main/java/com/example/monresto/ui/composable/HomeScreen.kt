package com.example.monresto.ui.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.monresto.data.DataService
import com.example.monresto.model.Menu

@Composable
fun HomeScreen(paddingValues: PaddingValues, onClick: (Menu) -> Unit){
    LazyColumn(
        content = {
            items(DataService().allMenu){
                menuList -> MenuView(menuList = menuList, onClick= {onClick(it)})
            }
        }
    )

}