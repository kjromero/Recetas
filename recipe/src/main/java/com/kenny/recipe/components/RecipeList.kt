package com.kenny.recipe.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.kenny.components.compose.theme.Background
import com.kenny.components.compose.theme.OnPrimary
import com.kenny.recipe.uimodels.RecipesUiModel
import com.kenny.recipe.viewmodels.RecipeViewModel

@Composable
fun RecipeList(
    uiState: RecipesUiModel,
    viewModel: RecipeViewModel,
) {
    Surface(
        color = Background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            uiState.recipes.forEach { recipe ->
                Row(
                    modifier = Modifier.padding(16.dp, 5.dp)
                        .clickable(
                            onClick = { viewModel.getRecipeDetail(recipe.id) },
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = rememberAsyncImagePainter(recipe.image),
                        contentDescription = null,
                        modifier = Modifier.size(58.dp)
                    )
                    Text(
                        modifier = Modifier.padding(8.dp, 0.dp),
                        text = recipe.title,
                        color = OnPrimary,
                        fontSize = 16.sp,
                        fontStyle = FontStyle.Italic,
                    )

                }

            }
        }
    }
}