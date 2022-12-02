package com.kenny.recipe.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kenny.components.compose.theme.Background
import com.kenny.components.compose.theme.OnPrimary
import com.kenny.components.compose.theme.OnSecondary
import com.kenny.recipe.uimodels.RecipesUiModel
import com.kenny.components.compose.theme.Primary


@Composable
fun RecipeList(
    uiState: RecipesUiModel,
) {
    Surface(
        color = Background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column() {
            uiState.recipes.forEach { recipe ->
                Row(
                ) {
                    Text(
                        text = recipe.id.toString(),
                        color = OnPrimary,
                    )
                    Text(
                        text = recipe.title,
                        color = OnPrimary,
                    )
                }

            }
        }
    }
}