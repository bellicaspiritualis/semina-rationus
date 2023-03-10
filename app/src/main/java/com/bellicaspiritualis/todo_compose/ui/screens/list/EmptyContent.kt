package com.bellicaspiritualis.todo_compose.ui.screens.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bellicaspiritualis.todo_compose.R
import com.bellicaspiritualis.todo_compose.ui.theme.MediumGray

@Composable
fun EmptyContent() {
    val fontFamily = FontFamily(
        Font(R.font.caudex_regular)
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier.size(250.dp),
            painter = painterResource(id = R.drawable.sr_150),
            contentDescription = stringResource(id = R.string.sr_150),
            tint = MediumGray
        )
        Text(text = stringResource(id = R.string.sr_150),
        color = MediumGray,
        fontWeight = FontWeight.Bold,
        fontSize = MaterialTheme.typography.h6.fontSize,
        fontFamily = fontFamily
        )
    }
}

@Composable
@Preview
private fun EmptyContentPreview() {
    EmptyContent()
}