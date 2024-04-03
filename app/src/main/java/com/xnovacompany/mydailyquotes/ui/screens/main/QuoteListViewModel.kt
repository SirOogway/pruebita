package com.xnovacompany.mydailyquotes.ui.screens.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class QuoteListViewModel : ViewModel() {
    var state by mutableStateOf(CardListState())
        private set
    var quoteList by mutableStateOf(listOf<Quote>())

    init {
        viewModelScope.launch {

            //state = state.copy(isLoading = true)
            delay(3000)
            //state = state.copy(
                quoteList = listOf(
                    Quote(
                        "Bruce Lee",
                        "“Esperar que la vida te trate bien por ser buena persona, es como esperar que un tigre no te ataque por ser vegetariano”."
                    ),
                    Quote(
                        "Hermann Heese",
                        "“La felicidad es amor, no otra cosa. El que sabe amar es feliz”."
                    )
                )//,
              //  isLoading = false
            //)
        }
    }
}