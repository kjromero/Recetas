package com.kenny.recipe.di;

import com.kenny.recipe.domain.usecases.GetRecipesUseCase;
import com.kenny.recipe.entities.data.Recipe;
import com.kenny.recipe.entities.qualifiers.GetRecipes;
import com.kenny.core.usecase.SingleUseCase;
import com.kenny.core.usecase.UseCase;
import com.kenny.recipe.entities.data.Recipes;
import com.kenny.recipe.entities.qualifiers.MapRecipesDataToRecipeUiModel;
import com.kenny.recipe.uimodels.RecipeModel;
import com.kenny.recipe.uimodels.RecipesUiModel;
import com.kenny.recipe.usescases.MapRecipesDataToRecipeUiModelUseCase;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/kenny/recipe/di/RecipeBindsModule;", "", "()V", "recipe_debug"})
@dagger.Module()
public abstract class RecipeBindsModule {
    
    public RecipeBindsModule() {
        super();
    }
}