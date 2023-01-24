package com.example.monresto.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.monresto.model.Article

@Composable

fun DetailView(article: Article, btnTitle: String, onClick: () -> Unit){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
    verticalArrangement = Arrangement.SpaceEvenly,
    horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(id = article.articleTitle), style = MaterialTheme.typography.h2)
        Image(
            painter = painterResource(id = article.articleImage),
            contentDescription = null
        )
        
        Button(onClick = onClick) {
            Text(text = btnTitle )
        }

    }
}