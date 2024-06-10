package com.example.ph44766_lab7.screens.component


import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.ph44766_lab7.data.SourceApp
import com.example.ph44766_lab7.screens.component.component.ItemRow

@Composable
fun ListRow() {
    LazyRow {
        items(SourceApp.data) { item ->
            ItemRow(item = item)
        }
    }
}