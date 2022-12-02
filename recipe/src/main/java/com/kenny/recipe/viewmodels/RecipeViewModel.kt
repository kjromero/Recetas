package com.kenny.recipe.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kenny.components.viewmodel.BaseViewModel
import com.kenny.recipe.entities.data.Recipe
import com.kenny.recipe.entities.qualifiers.GetRecipes
import com.kenny.core.usecase.SingleUseCase
import com.kenny.core.usecase.UseCase
import com.kenny.recipe.domain.usecases.GetRecipesUseCase
import com.kenny.recipe.entities.data.Recipes
import com.kenny.recipe.entities.qualifiers.MapRecipesDataToRecipeUiModel
import com.kenny.recipe.uimodels.RecipeModel
import com.kenny.recipe.uimodels.RecipesUiModel
import com.kenny.recipe.usescases.MapRecipesDataToRecipeUiModelUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class RecipeViewModel @Inject constructor(
    private val getRecipesUseCase: GetRecipesUseCase,
    private val mapRecipesDataToRecipesUiModel: MapRecipesDataToRecipeUiModelUseCase,
    ) : BaseViewModel() {

    private val _data = MutableLiveData(RecipesUiModel())
    val data = _data as LiveData<RecipesUiModel>

    fun getRecipes() {
        disposables.add(
            getRecipesUseCase.execute(Unit)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe {
                    _data.value = data.value?.copy(
                        loading = true,
                    )
                }
                .doOnTerminate {
                    _data.value = data.value?.copy(
                        loading = false,
                    )
                }
                .map {
                    mapRecipesDataToRecipesUiModel.execute(it)
                }
                .subscribe(
                    {
                        _data.value = data.value?.copy(
                            recipes = it.recipes
                        )
                    },
                    {
                        Log.e("ERROR", "Error ${it.message}")
                    }
                )
        )
    }

}