package com.kenny.recipe.domain.services.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RecipesResponse(
    @Json(name = "results") val recipes: List<RecipeResponse>,
)

@JsonClass(generateAdapter = true)
data class RecipeResponse(
    @Json(name = "id") val id: Int,
    @Json(name = "title") val title: String,
    @Json(name = "image") val image: String,
)