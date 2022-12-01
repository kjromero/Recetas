package com.kenny.recipe.interfaces

import com.kenny.recipe.entities.data.Recipe
import com.kenny.recipe.entities.data.Recipes
import io.reactivex.rxjava3.core.Single

interface RecipeRepository {
    fun getRecipes(): Single<Recipes>
}