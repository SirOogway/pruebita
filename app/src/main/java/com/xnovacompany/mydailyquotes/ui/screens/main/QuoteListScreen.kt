package com.xnovacompany.mydailyquotes.ui.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun QuoteListScreen(innerPadding: PaddingValues, viewModel: QuoteListViewModel/*state: CardListState*/) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    )
    {
        items(viewModel.quoteList) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = it.quote)
                Text(text = it.author)
                Divider()
            }
        }
    }
}