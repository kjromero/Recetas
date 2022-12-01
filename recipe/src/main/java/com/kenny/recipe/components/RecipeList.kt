package com.kenny.recipe.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.kenny.components.compose.theme.Background
import com.kenny.recipe.uimodels.RecipesUiModel
import com.kenny.components.compose.theme.Primary


@Composable
fun RecipeList(
    uiState: RecipesUiModel,
) {
    Surface(
        color = Background,
    ) {
       uiState.recipes.forEach { recipe ->
           Row {
               Text(
                   text = recipe.id.toString(),
                   color = Primary,
               )
               Text(
                   text = recipe.id.toString(),
                   color = Primary,
               )
           }
      
       }
    }
}