package com.krillinator.recap_1_navigation_composedestination.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InputTitleUI(title: String) {
    
    Surface(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Color.Black.copy(alpha = 0.6f),
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp)
        )
    }
    
}

@Preview
@Composable
fun InputTitleDebug() {
    InputTitleUI(title = "Hello world")
}