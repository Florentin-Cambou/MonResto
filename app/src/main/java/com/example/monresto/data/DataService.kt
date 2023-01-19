package com.example.monresto.data

import com.example.monresto.R
import com.example.monresto.model.Article
import com.example.monresto.model.Menu

class DataService {

    val burger = Article(articleTitle = R.string.burger, articleImage = R.drawable.burger)
    val charcu = Article(articleTitle = R.string.charcuterie, articleImage = R.drawable.charcuterie)
    val cheescake = Article(articleTitle = R.string.cheescake, articleImage = R.drawable.cheesecake_citon_litchi)
    val churros = Article(articleTitle = R.string.churros, articleImage = R.drawable.churros_et_creme_de_framboise)
    val crevette = Article(articleTitle = R.string.crevette, articleImage = R.drawable.crevette_aigre_doux)
    val fajitas = Article(articleTitle = R.string.fajitas, articleImage = R.drawable.fajitas)
    val fondue = Article(articleTitle = R.string.fondue, articleImage = R.drawable.fondue)
    val gaz = Article(articleTitle = R.string.gazpacho, articleImage = R.drawable.gazpacho)
    val gateau = Article(articleTitle = R.string.g_chocolat, articleImage = R.drawable.geateau_au_chocolat_suisse)
    val glace = Article(articleTitle = R.string.the, articleImage = R.drawable.glace_th__vert)
    val mozza = Article(articleTitle = R.string.mozza, articleImage = R.drawable.mozza)
    val nachos = Article(articleTitle = R.string.nachos, articleImage = R.drawable.nachos)
    val nem = Article(articleTitle = R.string.nem, articleImage = R.drawable.nem)
    val nuggets = Article(articleTitle = R.string.nuggets, articleImage = R.drawable.nuggets)
    val pizza = Article(articleTitle = R.string.pizza, articleImage = R.drawable.pizza)
    val paella = Article(articleTitle = R.string.paella, articleImage = R.drawable.paella)
    val sopapilla = Article(articleTitle = R.string.sopapilla, articleImage = R.drawable.sopapilla)
    val sundae = Article(articleTitle = R.string.sundea, articleImage = R.drawable.sundae)
    val sushis = Article(articleTitle = R.string.sushis, articleImage = R.drawable.sushis)
    val teriyaki = Article(articleTitle = R.string.teriyaki, articleImage = R.drawable.teriyaki)
    val tiramisu = Article(articleTitle = R.string.tiramisu, articleImage = R.drawable.tiramisu)


    val americain = Menu(menuName = R.string.americain, entree = nuggets, plat = burger, dessert = sundae)
    val chinois = Menu(menuName = R.string.chinois, entree = nem, plat = crevette, dessert = cheescake)
    val espagnol = Menu(menuName = R.string.espagnol, entree = gaz, plat = paella, dessert = churros)
    val italien = Menu(menuName = R.string.italien, entree = mozza, plat = pizza, dessert = tiramisu)
    val japonais = Menu(menuName = R.string.japonais, entree = sushis, plat = teriyaki, dessert = glace)
    val mexicain = Menu(menuName = R.string.mexicain, entree = nachos, plat = fajitas, dessert = sopapilla)
    val suisse = Menu(menuName = R.string.suisse, entree = charcu, plat = fondue, dessert = gateau)

    val allMenu = listOf<Menu>(americain, chinois, espagnol, italien, japonais, mexicain, suisse)
}