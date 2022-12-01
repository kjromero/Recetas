package com.kenny.recipe.uimodels

data class RecipesUiModel(
    val loading: Boolean = false,
    val recipes: List<RecipeModel> = listOf(),
)

data class RecipeModel(
    val id: Int,
    val title: String,
    val image: String,
)