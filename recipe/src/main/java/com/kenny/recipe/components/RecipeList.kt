package com.kenny.recipe.components

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.kenny.components.compose.theme.Background
import com.kenny.recipe.uimodels.RecipeUiModel
import java.lang.reflect.Modifier

@Composable
fun RecipeList(
    uiState: RecipeUiModel,
) {
    Surface(
        color = Background,
        modifier = Modifier.fillMaxSize()
    ) {
        items(

        )
    }
}