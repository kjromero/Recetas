package com.kenny.recipe.di

import com.kenny.recipe.domain.usecases.GetRecipesUseCase
import com.kenny.recipe.entities.data.Recipe
import com.kenny.recipe.entities.qualifiers.GetRecipes
import com.kenny.core.usecase.SingleUseCase
import com.kenny.core.usecase.UseCase
import com.kenny.recipe.entities.data.Recipes
import com.kenny.recipe.entities.qualifiers.MapRecipesDataToRecipeUiModel
import com.kenny.recipe.uimodels.RecipeModel
import com.kenny.recipe.uimodels.RecipesUiModel
import com.kenny.recipe.usescases.MapRecipesDataToRecipeUiModelUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@InstallIn(ViewModelComponent::class)
@Module
abstract class RecipeBindsModule {


}