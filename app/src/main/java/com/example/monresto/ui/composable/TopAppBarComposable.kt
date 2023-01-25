package com.example.monresto.ui.composable

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.monresto.R
import com.example.monresto.model.Screens
import com.example.monresto.ui.theme.Shapes


//Creation d'un bouton retour dans le top app bar

@Composable
fun TopAppBarComposable(
    screens: Screens,
    canGoBack: Boolean,
    up: () -> Unit
){
    TopAppBar(
        title = { Text(text = if(canGoBack) screens.title else "Mon Resto")},
        navigationIcon = {
            if (canGoBack){
                IconButton(onClick = up ) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                    
                }
            }else{
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo app",
                    modifier = Modifier.padding(5.dp)
                        .clip(shape = Shapes.small)
                )
            }
        }
    )
}