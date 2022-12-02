package com.kenny.recipe.entities.data

import java.io.Serializable

data class RecipeDetail(
    val summary: String,
    val title: String,
    val image: String,
) : Serializable