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
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/kenny/recipe/di/RecipeBindsModule;", "", "()V", "bindsGetRecipesUseCase", "Lcom/kenny/core/usecase/SingleUseCase;", "", "", "Lcom/kenny/recipe/entities/data/Recipe;", "getRecipesUseCase", "Lcom/kenny/recipe/domain/usecases/GetRecipesUseCase;", "bindsMapRecipesToRecipesUiModelUseCase", "Lcom/kenny/recipe/entities/data/Recipes;", "Lcom/kenny/recipe/uimodels/RecipesUiModel;", "mapRecipesDataToRecipeUiModelUseCase", "Lcom/kenny/recipe/usescases/MapRecipesDataToRecipeUiModelUseCase;", "recipe_debug"})
@dagger.Module()
public abstract class RecipeBindsModule {
    
    public RecipeBindsModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.kenny.recipe.entities.qualifiers.GetRecipes()
    @dagger.Binds()
    public abstract com.kenny.core.usecase.SingleUseCase<kotlin.Unit, java.util.List<com.kenny.recipe.entities.data.Recipe>> bindsGetRecipesUseCase(@org.jetbrains.annotations.NotNull()
    com.kenny.recipe.domain.usecases.GetRecipesUseCase getRecipesUseCase);
    
    @org.jetbrains.annotations.NotNull()
    @com.kenny.recipe.entities.qualifiers.MapRecipesDataToRecipeUiModel()
    @dagger.Binds()
    public abstract com.kenny.core.usecase.SingleUseCase<com.kenny.recipe.entities.data.Recipes, com.kenny.recipe.uimodels.RecipesUiModel> bindsMapRecipesToRecipesUiModelUseCase(@org.jetbrains.annotations.NotNull()
    com.kenny.recipe.usescases.MapRecipesDataToRecipeUiModelUseCase mapRecipesDataToRecipeUiModelUseCase);
}