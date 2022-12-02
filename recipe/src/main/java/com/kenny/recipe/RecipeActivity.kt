package com.kenny.recipe

import android.os.Bundle
import androidx.activity.viewModels
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.kenny.components.compose.theme.RecipeTheme
import com.kenny.recipe.components.LoaderView
import com.kenny.recipe.components.RecipeDetail
import com.kenny.recipe.components.RecipeList
import com.kenny.recipe.uimodels.RecipeScreen
import com.kenny.recipe.viewmodels.RecipeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RecipeActivity : AppCompatActivity() {

    private val viewModel: RecipeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val uiState by viewModel.data.observeAsState()

            RecipeTheme {
                uiState?.let { it ->
                    when (it.screen) {
                        RecipeScreen.List -> {
                            RecipeList(
                                uiState = it,
                                viewModel = viewModel,
                            )
                        }
                        RecipeScreen.Detail -> {
                            it.recipeDetail?.let { recipeDetail ->
                                RecipeDetail(recipeModel = recipeDetail)
                            }
                        }
                        RecipeScreen.Loader -> {
                            LoaderView()
                        }
                    }

                }
            }

        }
        viewModel.getRecipes()
    }
}