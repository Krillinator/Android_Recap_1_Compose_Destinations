package com.krillinator.recap_1_navigation_composedestination.ui.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InputFieldUI(
    placeholderText: String,
    labelText: String,
    input: String,
    onValueChangeInput: (String) -> Unit
) {
    Surface(
        modifier = Modifier
            // .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 24.dp)
        ) {
            OutlinedTextField(
                placeholder = { Text(text = "$placeholderText...", fontSize = 12.sp, color = Color.Black.copy(0.4f)) },
                label = { Text(text = labelText) },
                value = input,
                onValueChange = onValueChangeInput,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }
}

@Preview
@Composable
fun InputFieldPreview() {

    var input by remember {
        mutableStateOf("")
    }

    InputFieldUI(
        placeholderText = "username",
        labelText = "Username",
        input = input,
        onValueChangeInput = { input = it }
    )
}