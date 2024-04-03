package com.xnovacompany.mydailyquotes.ui.screens.main

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun MainScreen() {
val viewmodel = QuoteListViewModel()
    MyDailyQuotesApp {
        Scaffold( content = { innerPadding -> QuoteListScreen(innerPadding = innerPadding, viewModel = viewmodel ) } )
    }
}