package com.kenny.recipe.domain.repositories

import com.kenny.recipe.domain.services.RecipeService
import com.kenny.recipe.domain.services.model.RecipeResponse
import com.kenny.recipe.domain.services.model.RecipesResponse
import com.kenny.recipe.entities.data.Recipe
import com.kenny.recipe.entities.data.Recipes
import com.kenny.recipe.interfaces.RecipeRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class RecipeRepositoryImpl @Inject constructor(
    private val recipeService: RecipeService
) : RecipeRepository {
    override fun getRecipes(): Single<Recipes> {
        return recipeService.getRecipes().map { response -> response.toBaseModel() }
    }

    private fun RecipesResponse.toBaseModel(): Recipes {
        return Recipes(
            recipes = recipes.map { it.toBaseModel() }
        )
    }

    private fun RecipeResponse.toBaseModel(): Recipe {
        return Recipe(
            id = id,
            title = title,
            image = image,
        )
    }
}