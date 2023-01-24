package com.example.monresto.ui.composable

import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import com.example.monresto.model.Screens


//Creation d'un bouton retour dans le top app bar

@Composable
fun TopAppBarComposable(
    screens: Screens,
    canGoBack: Boolean,
    up: () -> Unit
){
    TopAppBar(
        title = { Text(text = "Mon Resto")},
        navigationIcon = {
            if (canGoBack){
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
            }
        }
    )
    
    
    
/*    TopAppBar(
        contentPadding = PaddingValues(5.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            modifier = Modifier.padding(2.dp),
            contentDescription = "This is logo app"
        )
        Text(
            text = "Mon Resto",
            modifier = Modifier.padding(start = 5.dp)
        )
    }*/
}