package com.kenny.recipe.domain.services.model

import com.google.gson.annotations.SerializedName

data class RecipeDetailResponse(
    @SerializedName("summary") val summary: String,
    @SerializedName("title") val title: String,
    @SerializedName("image") val image: String,
)
