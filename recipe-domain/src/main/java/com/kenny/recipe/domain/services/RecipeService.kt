package com.kenny.recipe.domain.services

import com.kenny.recipe.domain.services.model.RecipesResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface RecipeService {

    @GET("recipes/complexSearch?apiKey=2b50548061694b16b7703bf1a4148828")
    fun getRecipes(): Single<RecipesResponse>

}