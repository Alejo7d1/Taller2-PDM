package com.example.foodspot.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = FoodRed,
    onPrimary = Color.White,
    background = Color(0xFF121212),
    surface = Color(0xFF121212),
    onBackground = Color.White,
    onSurface = Color.White
)

private val LightColorScheme = lightColorScheme(
    primary = FoodRed,
    onPrimary = Color.White,
    background = Color.White,
    surface = Color.White,
    onBackground = Color.Black,
    onSurface = Color.Black,
    secondary = FoodGrayDark,
    onSecondary = Color.White
)

@Composable
fun FoodSpotTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val view = LocalView.current
    
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            // Use Transparent navigation bar to let it blend with background
            window.navigationBarColor = Color.Transparent.toArgb()
            
            // We set status bar to Red. In edge-to-edge, the TopAppBar 
            // will also draw here, but setting this ensures it's red.
            window.statusBarColor = FoodRed.toArgb()
            
            val insetsController = WindowCompat.getInsetsController(window, view)
            // White icons on the Red Status Bar
            insetsController.isAppearanceLightStatusBars = false
            // Dark icons on the White Navigation Bar (in light mode)
            insetsController.isAppearanceLightNavigationBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
