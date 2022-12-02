package com.kenny.recipe.domain.services.model

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class RecipesResponse(
    @SerializedName("results") val results: List<RecipeResponse>,
)

data class RecipeResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("image") val image: String,
)