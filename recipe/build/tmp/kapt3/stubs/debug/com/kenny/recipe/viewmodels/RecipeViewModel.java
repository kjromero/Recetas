package com.kenny.recipe.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kenny.components.viewmodel.BaseViewModel;
import com.kenny.recipe.entities.data.Recipe;
import com.kenny.recipe.entities.qualifiers.GetRecipes;
import com.kenny.core.usecase.SingleUseCase;
import com.kenny.core.usecase.UseCase;
import com.kenny.recipe.entities.data.Recipes;
import com.kenny.recipe.entities.qualifiers.MapRecipesDataToRecipeUiModel;
import com.kenny.recipe.uimodels.RecipeModel;
import com.kenny.recipe.uimodels.RecipesUiModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0004H\u0002R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\b0\b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/kenny/recipe/viewmodels/RecipeViewModel;", "Lcom/kenny/components/viewmodel/BaseViewModel;", "getRecipesUseCase", "Lcom/kenny/core/usecase/SingleUseCase;", "", "Lcom/kenny/recipe/entities/data/Recipes;", "mapRecipesDataToRecipesUiModel", "Lcom/kenny/core/usecase/UseCase;", "Lcom/kenny/recipe/uimodels/RecipesUiModel;", "(Lcom/kenny/core/usecase/SingleUseCase;Lcom/kenny/core/usecase/UseCase;)V", "_data", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "data", "Landroidx/lifecycle/LiveData;", "getData", "()Landroidx/lifecycle/LiveData;", "getRecipes", "recipe_debug"})
public final class RecipeViewModel extends com.kenny.components.viewmodel.BaseViewModel {
    private final com.kenny.core.usecase.SingleUseCase<kotlin.Unit, com.kenny.recipe.entities.data.Recipes> getRecipesUseCase = null;
    private final com.kenny.core.usecase.UseCase<com.kenny.recipe.entities.data.Recipes, com.kenny.recipe.uimodels.RecipesUiModel> mapRecipesDataToRecipesUiModel = null;
    private final androidx.lifecycle.MutableLiveData<com.kenny.recipe.uimodels.RecipesUiModel> _data = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.kenny.recipe.uimodels.RecipesUiModel> data = null;
    
    @javax.inject.Inject()
    public RecipeViewModel(@org.jetbrains.annotations.NotNull()
    @com.kenny.recipe.entities.qualifiers.GetRecipes()
    com.kenny.core.usecase.SingleUseCase<kotlin.Unit, com.kenny.recipe.entities.data.Recipes> getRecipesUseCase, @org.jetbrains.annotations.NotNull()
    @com.kenny.recipe.entities.qualifiers.MapRecipesDataToRecipeUiModel()
    com.kenny.core.usecase.UseCase<com.kenny.recipe.entities.data.Recipes, com.kenny.recipe.uimodels.RecipesUiModel> mapRecipesDataToRecipesUiModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kenny.recipe.uimodels.RecipesUiModel> getData() {
        return null;
    }
    
    private final void getRecipes() {
    }
}