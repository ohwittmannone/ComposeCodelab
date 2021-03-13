package com.example.composecodelab.ui.theme

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun MyApp(content: @Composable () -> Unit) {
    ComposeCodelabTheme {
        Surface(color = Color.Yellow) {
            content()
        }
    }
}