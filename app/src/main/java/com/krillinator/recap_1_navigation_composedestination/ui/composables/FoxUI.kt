package com.krillinator.recap_1_navigation_composedestination.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.krillinator.recap_1_navigation_composedestination.ui.viewModels.FoxViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage

@Composable
fun FoxUI(viewModel: FoxViewModel = viewModel()) {
    val fox by viewModel.foxState

    // Trigger fetch on initial composition
    LaunchedEffect(true) {
        viewModel.fetchFoxImage()
    }

    if (fox != null) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = fox?.image.toString())
            AsyncImage(
                model = fox?.image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape)
            )
        }
    } else {
        Text(text = "Loading...")
    }
}