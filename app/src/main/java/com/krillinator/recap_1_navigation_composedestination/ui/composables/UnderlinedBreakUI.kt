package com.krillinator.recap_1_navigation_composedestination.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun UnderlinedBreak() {
    Surface(
        color = Color.Gray.copy(0.4f), // Set the color of the underlined row to gray
        modifier = Modifier
            .padding(bottom = 48.dp)
            .height(2.dp) // Adjust the height of the underlined row
    ) {
        // This empty space can be adjusted to control the spacing around the line
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}