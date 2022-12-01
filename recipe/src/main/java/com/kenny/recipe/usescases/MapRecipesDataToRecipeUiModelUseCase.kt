package com.kenny.recipe.usescases

import com.kenny.core.usecase.UseCase
import com.kenny.recipe.entities.data.Recipe
import com.kenny.recipe.entities.data.Recipes
import com.kenny.recipe.uimodels.RecipeModel
import com.kenny.recipe.uimodels.RecipesUiModel
import javax.inject.Inject

class MapRecipesDataToRecipeUiModelUseCase @Inject constructor() :
    UseCase<Recipes, RecipesUiModel>() {
    override fun execute(input: Recipes): RecipesUiModel {
        return RecipesUiModel(
            recipes = input.recipes.map {
                it.toBaseModel()
            }
        )
    }

    private fun Recipe.toBaseModel(): RecipeModel {
        return RecipeModel(
            id = id,
            title = title,
            image = image,
        )
    }
}