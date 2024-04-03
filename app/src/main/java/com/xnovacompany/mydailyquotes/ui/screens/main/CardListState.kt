package com.xnovacompany.mydailyquotes.ui.screens.main

data class CardListState(
    var cardList: List<Quote> = emptyList(),
    var isLoading: Boolean = false
)
