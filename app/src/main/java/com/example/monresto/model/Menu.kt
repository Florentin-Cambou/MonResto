package com.example.monresto.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Menu(@StringRes val menuName: Int, val entree: Article,val plat: Article,val dessert: Article)
