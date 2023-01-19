package com.example.monresto.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Article(@StringRes val articleTitle: Int,@DrawableRes val articleImage: Int)
