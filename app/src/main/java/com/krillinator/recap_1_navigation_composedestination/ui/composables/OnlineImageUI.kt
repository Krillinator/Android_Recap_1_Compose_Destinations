package com.krillinator.recap_1_navigation_composedestination.ui.composables

import androidx.compose.runtime.Composable
import coil.compose.AsyncImage

@Composable
fun LoadImageFromUrl(url: String) {

    AsyncImage(
        model = url,
        contentDescription = null,
    )

}
