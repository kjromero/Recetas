package com.kenny.recipe.entities.data

data class Recipes(
    val recipes: List<Recipe>
)

data class Recipe(
    val id: Int,
    val title: String,
    val image: String,
)