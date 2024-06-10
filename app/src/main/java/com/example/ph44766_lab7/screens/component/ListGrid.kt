package com.example.ph44766_lab7.screens.component

import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import com.example.ph44766_lab7.data.SourceApp
import com.example.ph44766_lab7.screens.component.component.ItemRow

@Composable
fun ListGrid() {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2)
    ) {
        items(SourceApp.data) { item -> ItemRow(item = item) }
    }
}