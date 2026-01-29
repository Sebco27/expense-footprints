package io.github.sebco27.moneytracer.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = IncomeGreen,
    secondary = ExpenseRed,
    tertiary = NeutralColor,

    background = DarkBackground,
    surface = DarkSurface,

    onBackground = PrimaryDarkText,
    onSurface = PrimaryDarkText
)

private val LightColorScheme = lightColorScheme(
    primary = IncomeGreen,
    secondary = ExpenseRed,
    tertiary = NeutralColor
)

@Composable
fun MoneyTracerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}