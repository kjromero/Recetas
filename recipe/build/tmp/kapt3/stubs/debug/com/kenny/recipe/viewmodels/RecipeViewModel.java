package com.kenny.recipe.viewmodels;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kenny.components.viewmodel.BaseViewModel;
import com.kenny.recipe.entities.data.Recipe;
import com.kenny.recipe.entities.qualifiers.GetRecipes;
import com.kenny.core.usecase.SingleUseCase;
import com.kenny.core.usecase.UseCase;
import com.kenny.recipe.domain.usecases.GetRecipeDetailUseCase;
import com.kenny.recipe.domain.usecases.GetRecipesUseCase;
import com.kenny.recipe.entities.data.Recipes;
import com.kenny.recipe.entities.qualifiers.MapRecipesDataToRecipeUiModel;
import com.kenny.recipe.uimodels.RecipeDetailModel;
import com.kenny.recipe.uimodels.RecipeModel;
import com.kenny.recipe.uimodels.RecipeScreen;
import com.kenny.recipe.uimodels.RecipesUiModel;
import com.kenny.recipe.usescases.MapRecipesDataToRecipeUiModelUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/kenny/recipe/viewmodels/RecipeViewModel;", "Lcom/kenny/components/viewmodel/BaseViewModel;", "getRecipesUseCase", "Lcom/kenny/recipe/domain/usecases/GetRecipesUseCase;", "getRecipeDetailUseCase", "Lcom/kenny/recipe/domain/usecases/GetRecipeDetailUseCase;", "mapRecipesDataToRecipesUiModel", "Lcom/kenny/recipe/usescases/MapRecipesDataToRecipeUiModelUseCase;", "(Lcom/kenny/recipe/domain/usecases/GetRecipesUseCase;Lcom/kenny/recipe/domain/usecases/GetRecipeDetailUseCase;Lcom/kenny/recipe/usescases/MapRecipesDataToRecipeUiModelUseCase;)V", "_data", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kenny/recipe/uimodels/RecipesUiModel;", "kotlin.jvm.PlatformType", "data", "Landroidx/lifecycle/LiveData;", "getData", "()Landroidx/lifecycle/LiveData;", "getRecipeDetail", "", "id", "", "getRecipes", "recipe_debug"})
public final class RecipeViewModel extends com.kenny.components.viewmodel.BaseViewModel {
    private final com.kenny.recipe.domain.usecases.GetRecipesUseCase getRecipesUseCase = null;
    private final com.kenny.recipe.domain.usecases.GetRecipeDetailUseCase getRecipeDetailUseCase = null;
    private final com.kenny.recipe.usescases.MapRecipesDataToRecipeUiModelUseCase mapRecipesDataToRecipesUiModel = null;
    private final androidx.lifecycle.MutableLiveData<com.kenny.recipe.uimodels.RecipesUiModel> _data = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.kenny.recipe.uimodels.RecipesUiModel> data = null;
    
    @javax.inject.Inject()
    public RecipeViewModel(@org.jetbrains.annotations.NotNull()
    com.kenny.recipe.domain.usecases.GetRecipesUseCase getRecipesUseCase, @org.jetbrains.annotations.NotNull()
    com.kenny.recipe.domain.usecases.GetRecipeDetailUseCase getRecipeDetailUseCase, @org.jetbrains.annotations.NotNull()
    com.kenny.recipe.usescases.MapRecipesDataToRecipeUiModelUseCase mapRecipesDataToRecipesUiModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kenny.recipe.uimodels.RecipesUiModel> getData() {
        return null;
    }
    
    public final void getRecipes() {
    }
    
    public final void getRecipeDetail(int id) {
    }
}