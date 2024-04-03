package com.xnovacompany.mydailyquotes.ui.screens.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.xnovacompany.mydailyquotes.ui.theme.MyDailyQuotesTheme

@Composable
fun MyDailyQuotesApp(content: @Composable () -> Unit) {
    MyDailyQuotesTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }
    }
}