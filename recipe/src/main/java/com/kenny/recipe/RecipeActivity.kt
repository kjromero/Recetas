package com.kenny.recipe

import android.os.Bundle
import androidx.activity.viewModels
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.core.view.WindowCompat
import com.kenny.components.compose.theme.RecipeTheme
import com.kenny.recipe.components.RecipeList
import com.kenny.recipe.viewmodels.RecipeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RecipeActivity : AppCompatActivity() {

    private val viewModel: RecipeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            val uiState by viewModel.data.observeAsState()

            RecipeTheme {
                RecipeList(uiState = uiState!!)
            }

        }
        viewModel.getRecipes()
    }
}