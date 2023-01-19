package com.example.monresto.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.monresto.R
@Composable
fun TopAppBarComposable(){
    TopAppBar(contentPadding = PaddingValues(5.dp)) {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "This is logo app")
        Text(
            text = "Mon Resto",
            modifier = Modifier.padding(start = 5.dp)
        )
    }
}