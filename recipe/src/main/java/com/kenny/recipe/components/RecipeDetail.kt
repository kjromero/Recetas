package com.kenny.recipe.components

import androidx.compose.foundation.Image
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
import com.kenny.recipe.uimodels.RecipeDetailModel

@Composable
fun RecipeDetail(
    recipeModel: RecipeDetailModel
) {
    Surface(
        color = Background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                modifier = Modifier.padding(0.dp, 8.dp),
                text = recipeModel.title,
                color = OnPrimary,
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
            )
            Image(
                painter = rememberAsyncImagePainter(recipeModel.image),
                contentDescription = null,
                modifier = Modifier.size(300.dp)
            )
            Text(
                modifier = Modifier.padding(0.dp, 0.dp),
                text = recipeModel.summary,
                color = OnPrimary,
                fontSize = 14.sp,
                fontStyle = FontStyle.Italic,
            )

        }
    }
}