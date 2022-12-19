package com.bellicaspiritualis.todo_compose.util

import androidx.compose.material.Text
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.bellicaspiritualis.todo_compose.R


enum class Action {
    ADD,
    UPDATE,
    DELETE,
    DELETE_ALL,
    UNDO,
    NO_ACTION,
}

fun String?.toAction(): Action{
    return if (this.isNullOrEmpty()) Action.NO_ACTION else Action.valueOf(this)
}