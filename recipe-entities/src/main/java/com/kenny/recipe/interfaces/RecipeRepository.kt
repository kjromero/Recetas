package com.kenny.recipe.interfaces

import com.kenny.recipe.entities.data.RecipeDetail
import com.kenny.recipe.entities.data.Recipes
import io.reactivex.rxjava3.core.Single

interface RecipeRepository {
    fun getRecipes(): Single<Recipes>
    fun getRecipeDetail(id: Int): Single<RecipeDetail>
}
