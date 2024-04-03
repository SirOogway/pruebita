package com.xnovacompany.mydailyquotes.ui.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp


@Composable
fun TitleApp(padding: PaddingValues) {
    Column(
        modifier = Modifier.padding(padding).fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "My Daily",
            fontSize = 30.sp
        )
        Text(
            text = "Quotes",
            fontSize = 40.sp,
            letterSpacing = 0.15.em
        )
    }
}

//Only Preview
@Preview(showBackground = true,
    widthDp = 500,
    heightDp = 500)
@Composable
private fun PreviewTitleApp(){
    TitleApp(padding = PaddingValues(0.dp))
}