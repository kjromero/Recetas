package com.kenny.recipe.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kenny.components.compose.theme.Background

@Composable
fun LoaderView() {
    Surface(
        color = Background,
        modifier = Modifier.fillMaxSize()
    ) {
        CircularProgressIndicator()
    }
}