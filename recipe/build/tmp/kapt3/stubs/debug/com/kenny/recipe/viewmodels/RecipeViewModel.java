package com.kenny.recipe.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kenny.components.viewmodel.BaseViewModel;
import com.kenny.recipe.entities.data.Recipe;
import com.kenny.recipe.entities.qualifiers.GetRecipes;
import com.kenny.recipe.interfaces.SingleUseCase;
import com.kenny.recipe.uimodels.RecipeUiModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/kenny/recipe/viewmodels/RecipeViewModel;", "Lcom/kenny/components/viewmodel/BaseViewModel;", "getFeedItemUseCase", "error/NonExistentClass", "(Lerror/NonExistentClass;)V", "_data", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kenny/recipe/uimodels/RecipeUiModel;", "kotlin.jvm.PlatformType", "data", "Landroidx/lifecycle/LiveData;", "getData", "()Landroidx/lifecycle/LiveData;", "Lerror/NonExistentClass;", "recipe_debug"})
public final class RecipeViewModel extends com.kenny.components.viewmodel.BaseViewModel {
    private final SingleUseCase<kotlin.Unit, java.util.List<com.kenny.recipe.entities.data.Recipe>> getFeedItemUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.kenny.recipe.uimodels.RecipeUiModel> _data = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.kenny.recipe.uimodels.RecipeUiModel> data = null;
    
    @javax.inject.Inject()
    public RecipeViewModel(@org.jetbrains.annotations.NotNull()
    @com.kenny.recipe.entities.qualifiers.GetRecipes()
    SingleUseCase<kotlin.Unit, java.util.List<com.kenny.recipe.entities.data.Recipe>> getFeedItemUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kenny.recipe.uimodels.RecipeUiModel> getData() {
        return null;
    }
}