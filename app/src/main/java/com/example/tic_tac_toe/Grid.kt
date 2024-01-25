package com.example.tic_tac_toe

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Grid(rowCount:Int, colCount:Int){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        GridRow(elementCount = colCount)
        GridRow(elementCount = colCount)
        GridRow(elementCount = colCount)
    }
}

@Composable
fun GridRow(elementCount: Int){
    LazyRow{
        items(elementCount){it->
            GridCell()
        }
    }
}

@Composable
fun GridCell(){
    Box(modifier = Modifier
        .background(color = Color.Black)
        .size(100.dp)
    )
}

