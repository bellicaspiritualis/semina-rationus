package com.bellicaspiritualis.todo_compose.ui.screens.splash

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.bellicaspiritualis.todo_compose.R
import com.bellicaspiritualis.todo_compose.ui.theme.LOGO_HEIGHT
import com.bellicaspiritualis.todo_compose.ui.theme.splashScreenBackground
import com.bellicaspiritualis.todo_compose.util.Constants.SPLASH_SCREEN_DELAY
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navigateToListScreen:() -> Unit,
) {
    var startAnimation by remember { mutableStateOf(false) }

    val offsetState by animateDpAsState(targetValue = if (startAnimation) 0.dp else 100.dp,
        animationSpec = tween(
            durationMillis = 2500
            )
        )

    val alphaState by animateFloatAsState(
        targetValue = if(startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 50
        )
    )

    LaunchedEffect(key1 = true ) {
        startAnimation = true
        delay(SPLASH_SCREEN_DELAY)
        navigateToListScreen()
    }
    Splash(offsetState = offsetState, alphaState = alphaState)
}

@Composable
fun Splash(
    offsetState: Dp,
    alphaState: Float
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.splashScreenBackground),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier
                .size(LOGO_HEIGHT)
                .offset(y = offsetState)
                .alpha(alpha = alphaState),
            painter = painterResource(id = getLogo()),
            contentDescription = stringResource(id = R.string.jesusegoteconfido))
    }
}

@Composable
fun getLogo(): Int {
    return if (isSystemInDarkTheme()) {
        R.drawable.jesus
    } else {
        R.drawable.jesus
    }
}

@Composable
@Preview
private fun SplashScreenPreview() {
        Splash(offsetState = 0.dp, alphaState = 1f)
}