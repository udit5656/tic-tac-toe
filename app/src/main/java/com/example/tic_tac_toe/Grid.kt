package com.example.tic_tac_toe

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
fun Grid(color: Color,onClick:()->Unit, rowCount:Int, colCount:Int){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        GridRow(color,onClick,elementCount = colCount)
        GridRow(color,onClick,elementCount = colCount)
        GridRow(color,onClick,elementCount = colCount)
    }
}

@Composable
fun GridRow(color:Color,onClick: () -> Unit,elementCount: Int){
    LazyRow{
        items(elementCount){it->
            GridCell(onClick,color)
        }
    }
}

@Composable
fun GridCell(onClick: () -> Unit,color: Color){
    Box(modifier = Modifier
        .background(color = color)
        .size(100.dp)
        .clickable { onClick() }
    )
}

