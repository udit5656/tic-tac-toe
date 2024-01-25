package com.example.tic_tac_toe

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow


class GridViewModel:ViewModel() {
    private val _color = MutableStateFlow(Color.Black)
    val color = _color.asStateFlow()

    fun toggleColor(){
        if(_color.value==Color.Black)_color.value= Color.Blue
        else _color.value = Color.Black
    }
}