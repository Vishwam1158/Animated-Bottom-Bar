package com.viz.animatedbottombar.ui.theme


import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

const val DEFAULT_PADDING = 44

private val DarkColorPalette = darkColorScheme(
    primary = Purple200,
    tertiary = Purple700,
    secondary = Pink,
    background = DarkPurple
)

@Composable
fun BottomNavigationTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

