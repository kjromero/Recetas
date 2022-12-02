package com.kenny.recipe.uimodels

data class RecipesUiModel(
    val loading: Boolean = false,
    val recipes: List<RecipeModel> = listOf(),
    val recipeDetail: RecipeDetailModel? = null,
    val screen: RecipeScreen = RecipeScreen.Loader,

)

data class RecipeModel(
    val id: Int,
    val title: String,
    val image: String,
)

data class RecipeDetailModel(
    val title: String,
    val image: String,
    val summary: String,
)

sealed class RecipeScreen {
    object List : RecipeScreen()
    object Detail : RecipeScreen()
    object Loader : RecipeScreen()
}