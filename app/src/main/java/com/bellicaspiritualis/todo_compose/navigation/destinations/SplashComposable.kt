package com.bellicaspiritualis.todo_compose.navigation.destinations

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideOutVertically
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import com.bellicaspiritualis.todo_compose.ui.screens.splash.SplashScreen
import com.bellicaspiritualis.todo_compose.util.Constants.SPLASH_SCREEN


@ExperimentalAnimationApi
fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit
) {
    composable(
        route = SPLASH_SCREEN,
        exitTransition = { _, _ ->
            slideOutVertically(
                targetOffsetY = { fullHeight -> -fullHeight },
                animationSpec = tween(150)
            )
        }
    ) {
        SplashScreen(navigateToListScreen = navigateToListScreen)
    }
}