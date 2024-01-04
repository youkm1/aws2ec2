package com.example.compose
import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.example.GreenKim.ui.theme.typography

@Immutable
data class ExtendedColorScheme(
    val customColor1: ColorFamily,
    val customColor2: ColorFamily,
    val fABZeroWaste: ColorFamily,
    val customColor4: ColorFamily,
    val customColor5: ColorFamily,
    val customColor6: ColorFamily,
    val customColor7: ColorFamily,
    val fABCommunity: ColorFamily,

)

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,

)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,

)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,

)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,

)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,

)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
)

val extendedLight = ExtendedColorScheme(
  customColor1 = ColorFamily(
  customColor1Light,
  onCustomColor1Light,
  customColor1ContainerLight,
  onCustomColor1ContainerLight,
  ),
  customColor2 = ColorFamily(
  customColor2Light,
  onCustomColor2Light,
  customColor2ContainerLight,
  onCustomColor2ContainerLight,
  ),
  fABZeroWaste = ColorFamily(
  fABZeroWasteLight,
  onFABZeroWasteLight,
  fABZeroWasteContainerLight,
  onFABZeroWasteContainerLight,
  ),
  customColor4 = ColorFamily(
  customColor4Light,
  onCustomColor4Light,
  customColor4ContainerLight,
  onCustomColor4ContainerLight,
  ),
  customColor5 = ColorFamily(
  customColor5Light,
  onCustomColor5Light,
  customColor5ContainerLight,
  onCustomColor5ContainerLight,
  ),
  customColor6 = ColorFamily(
  customColor6Light,
  onCustomColor6Light,
  customColor6ContainerLight,
  onCustomColor6ContainerLight,
  ),
  customColor7 = ColorFamily(
  customColor7Light,
  onCustomColor7Light,
  customColor7ContainerLight,
  onCustomColor7ContainerLight,
  ),
  fABCommunity = ColorFamily(
  fABCommunityLight,
  onFABCommunityLight,
  fABCommunityContainerLight,
  onFABCommunityContainerLight,
  ),
)

val extendedDark = ExtendedColorScheme(
  customColor1 = ColorFamily(
  customColor1Dark,
  onCustomColor1Dark,
  customColor1ContainerDark,
  onCustomColor1ContainerDark,
  ),
  customColor2 = ColorFamily(
  customColor2Dark,
  onCustomColor2Dark,
  customColor2ContainerDark,
  onCustomColor2ContainerDark,
  ),
  fABZeroWaste = ColorFamily(
  fABZeroWasteDark,
  onFABZeroWasteDark,
  fABZeroWasteContainerDark,
  onFABZeroWasteContainerDark,
  ),
  customColor4 = ColorFamily(
  customColor4Dark,
  onCustomColor4Dark,
  customColor4ContainerDark,
  onCustomColor4ContainerDark,
  ),
  customColor5 = ColorFamily(
  customColor5Dark,
  onCustomColor5Dark,
  customColor5ContainerDark,
  onCustomColor5ContainerDark,
  ),
  customColor6 = ColorFamily(
  customColor6Dark,
  onCustomColor6Dark,
  customColor6ContainerDark,
  onCustomColor6ContainerDark,
  ),
  customColor7 = ColorFamily(
  customColor7Dark,
  onCustomColor7Dark,
  customColor7ContainerDark,
  onCustomColor7ContainerDark,
  ),
  fABCommunity = ColorFamily(
  fABCommunityDark,
  onFABCommunityDark,
  fABCommunityContainerDark,
  onFABCommunityContainerDark,
  ),
)

val extendedLightMediumContrast = ExtendedColorScheme(
  customColor1 = ColorFamily(
  customColor1LightMediumContrast,
  onCustomColor1LightMediumContrast,
  customColor1ContainerLightMediumContrast,
  onCustomColor1ContainerLightMediumContrast,
  ),
  customColor2 = ColorFamily(
  customColor2LightMediumContrast,
  onCustomColor2LightMediumContrast,
  customColor2ContainerLightMediumContrast,
  onCustomColor2ContainerLightMediumContrast,
  ),
  fABZeroWaste = ColorFamily(
  fABZeroWasteLightMediumContrast,
  onFABZeroWasteLightMediumContrast,
  fABZeroWasteContainerLightMediumContrast,
  onFABZeroWasteContainerLightMediumContrast,
  ),
  customColor4 = ColorFamily(
  customColor4LightMediumContrast,
  onCustomColor4LightMediumContrast,
  customColor4ContainerLightMediumContrast,
  onCustomColor4ContainerLightMediumContrast,
  ),
  customColor5 = ColorFamily(
  customColor5LightMediumContrast,
  onCustomColor5LightMediumContrast,
  customColor5ContainerLightMediumContrast,
  onCustomColor5ContainerLightMediumContrast,
  ),
  customColor6 = ColorFamily(
  customColor6LightMediumContrast,
  onCustomColor6LightMediumContrast,
  customColor6ContainerLightMediumContrast,
  onCustomColor6ContainerLightMediumContrast,
  ),
  customColor7 = ColorFamily(
  customColor7LightMediumContrast,
  onCustomColor7LightMediumContrast,
  customColor7ContainerLightMediumContrast,
  onCustomColor7ContainerLightMediumContrast,
  ),
  fABCommunity = ColorFamily(
  fABCommunityLightMediumContrast,
  onFABCommunityLightMediumContrast,
  fABCommunityContainerLightMediumContrast,
  onFABCommunityContainerLightMediumContrast,
  ),
)

val extendedLightHighContrast = ExtendedColorScheme(
  customColor1 = ColorFamily(
  customColor1LightHighContrast,
  onCustomColor1LightHighContrast,
  customColor1ContainerLightHighContrast,
  onCustomColor1ContainerLightHighContrast,
  ),
  customColor2 = ColorFamily(
  customColor2LightHighContrast,
  onCustomColor2LightHighContrast,
  customColor2ContainerLightHighContrast,
  onCustomColor2ContainerLightHighContrast,
  ),
  fABZeroWaste = ColorFamily(
  fABZeroWasteLightHighContrast,
  onFABZeroWasteLightHighContrast,
  fABZeroWasteContainerLightHighContrast,
  onFABZeroWasteContainerLightHighContrast,
  ),
  customColor4 = ColorFamily(
  customColor4LightHighContrast,
  onCustomColor4LightHighContrast,
  customColor4ContainerLightHighContrast,
  onCustomColor4ContainerLightHighContrast,
  ),
  customColor5 = ColorFamily(
  customColor5LightHighContrast,
  onCustomColor5LightHighContrast,
  customColor5ContainerLightHighContrast,
  onCustomColor5ContainerLightHighContrast,
  ),
  customColor6 = ColorFamily(
  customColor6LightHighContrast,
  onCustomColor6LightHighContrast,
  customColor6ContainerLightHighContrast,
  onCustomColor6ContainerLightHighContrast,
  ),
  customColor7 = ColorFamily(
  customColor7LightHighContrast,
  onCustomColor7LightHighContrast,
  customColor7ContainerLightHighContrast,
  onCustomColor7ContainerLightHighContrast,
  ),
  fABCommunity = ColorFamily(
  fABCommunityLightHighContrast,
  onFABCommunityLightHighContrast,
  fABCommunityContainerLightHighContrast,
  onFABCommunityContainerLightHighContrast,
  ),
)

val extendedDarkMediumContrast = ExtendedColorScheme(
  customColor1 = ColorFamily(
  customColor1DarkMediumContrast,
  onCustomColor1DarkMediumContrast,
  customColor1ContainerDarkMediumContrast,
  onCustomColor1ContainerDarkMediumContrast,
  ),
  customColor2 = ColorFamily(
  customColor2DarkMediumContrast,
  onCustomColor2DarkMediumContrast,
  customColor2ContainerDarkMediumContrast,
  onCustomColor2ContainerDarkMediumContrast,
  ),
  fABZeroWaste = ColorFamily(
  fABZeroWasteDarkMediumContrast,
  onFABZeroWasteDarkMediumContrast,
  fABZeroWasteContainerDarkMediumContrast,
  onFABZeroWasteContainerDarkMediumContrast,
  ),
  customColor4 = ColorFamily(
  customColor4DarkMediumContrast,
  onCustomColor4DarkMediumContrast,
  customColor4ContainerDarkMediumContrast,
  onCustomColor4ContainerDarkMediumContrast,
  ),
  customColor5 = ColorFamily(
  customColor5DarkMediumContrast,
  onCustomColor5DarkMediumContrast,
  customColor5ContainerDarkMediumContrast,
  onCustomColor5ContainerDarkMediumContrast,
  ),
  customColor6 = ColorFamily(
  customColor6DarkMediumContrast,
  onCustomColor6DarkMediumContrast,
  customColor6ContainerDarkMediumContrast,
  onCustomColor6ContainerDarkMediumContrast,
  ),
  customColor7 = ColorFamily(
  customColor7DarkMediumContrast,
  onCustomColor7DarkMediumContrast,
  customColor7ContainerDarkMediumContrast,
  onCustomColor7ContainerDarkMediumContrast,
  ),
  fABCommunity = ColorFamily(
  fABCommunityDarkMediumContrast,
  onFABCommunityDarkMediumContrast,
  fABCommunityContainerDarkMediumContrast,
  onFABCommunityContainerDarkMediumContrast,
  ),
)

val extendedDarkHighContrast = ExtendedColorScheme(
  customColor1 = ColorFamily(
  customColor1DarkHighContrast,
  onCustomColor1DarkHighContrast,
  customColor1ContainerDarkHighContrast,
  onCustomColor1ContainerDarkHighContrast,
  ),
  customColor2 = ColorFamily(
  customColor2DarkHighContrast,
  onCustomColor2DarkHighContrast,
  customColor2ContainerDarkHighContrast,
  onCustomColor2ContainerDarkHighContrast,
  ),
  fABZeroWaste = ColorFamily(
  fABZeroWasteDarkHighContrast,
  onFABZeroWasteDarkHighContrast,
  fABZeroWasteContainerDarkHighContrast,
  onFABZeroWasteContainerDarkHighContrast,
  ),
  customColor4 = ColorFamily(
  customColor4DarkHighContrast,
  onCustomColor4DarkHighContrast,
  customColor4ContainerDarkHighContrast,
  onCustomColor4ContainerDarkHighContrast,
  ),
  customColor5 = ColorFamily(
  customColor5DarkHighContrast,
  onCustomColor5DarkHighContrast,
  customColor5ContainerDarkHighContrast,
  onCustomColor5ContainerDarkHighContrast,
  ),
  customColor6 = ColorFamily(
  customColor6DarkHighContrast,
  onCustomColor6DarkHighContrast,
  customColor6ContainerDarkHighContrast,
  onCustomColor6ContainerDarkHighContrast,
  ),
  customColor7 = ColorFamily(
  customColor7DarkHighContrast,
  onCustomColor7DarkHighContrast,
  customColor7ContainerDarkHighContrast,
  onCustomColor7ContainerDarkHighContrast,
  ),
  fABCommunity = ColorFamily(
  fABCommunityDarkHighContrast,
  onFABCommunityDarkHighContrast,
  fABCommunityContainerDarkHighContrast,
  onFABCommunityContainerDarkHighContrast,
  ),
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun GreenKimTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable() () -> Unit
) {
  val colorScheme = when {
      dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
          val context = LocalContext.current
          if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
      }
      
      darkTheme -> darkScheme
      else -> lightScheme
  }
  val view = LocalView.current
  if (!view.isInEditMode) {
    SideEffect {
      val window = (view.context as Activity).window
      window.statusBarColor = colorScheme.primary.toArgb()
      WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
    }
  }

  MaterialTheme(
    colorScheme = colorScheme,
    typography = typography,
    content = content
  )
}

