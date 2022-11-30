package com.kenny.recipe.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kenny.components.viewmodel.BaseViewModel
import com.kenny.recipe.entities.data.Recipe
import com.kenny.recipe.entities.qualifiers.GetRecipes
import com.kenny.recipe.interfaces.SingleUseCase
import com.kenny.recipe.uimodels.RecipeUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipeViewModel @Inject constructor(
    @GetRecipes private val getFeedItemUseCase: SingleUseCase<Unit, List<Recipe>>,
) : BaseViewModel() {

    private val _data = MutableLiveData(RecipeUiModel())
    val data = _data as LiveData<RecipeUiModel>

}