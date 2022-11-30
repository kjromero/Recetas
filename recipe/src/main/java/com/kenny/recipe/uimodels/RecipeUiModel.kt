package com.kenny.recipe.uimodels

data class RecipeUiModel(
    val loading: Boolean = false,
    val recipes: List<Recipe> = listOf(),
)

data class Recipe(
    val id: Int,
    val title: String,
    val image: String,
)