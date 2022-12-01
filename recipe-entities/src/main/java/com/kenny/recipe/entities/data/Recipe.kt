package com.kenny.recipe.entities.data

import java.io.Serializable

data class Recipes(
    val recipes: List<Recipe>
): Serializable

data class Recipe(
    val id: Int,
    val title: String,
    val image: String,
) : Serializable