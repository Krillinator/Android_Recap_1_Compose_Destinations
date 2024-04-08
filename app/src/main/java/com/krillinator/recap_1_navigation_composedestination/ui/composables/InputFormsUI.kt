package com.krillinator.recap_1_navigation_composedestination.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun InputFormsUI() {

    var input by remember {
        mutableStateOf("")
    }

    // TODO - Themes
    // TODO - Break 14:24

    Surface(
        shadowElevation = 12.dp,
        modifier = Modifier
            .padding(24.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(top = 24.dp)
                .padding(horizontal = 24.dp)
                .padding(bottom = 60.dp)
        ) {
            InputTitleUI(title = "Hello World")

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                UnderlinedBreak()
                InputFieldUI("Username", "Username",input = input, onValueChangeInput = { input = it })
                InputFieldUI("Password", "Password",input = input, onValueChangeInput = { input = it })

                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Submit")
                }
            }

        }
    }
}

/* TODO - How do we begin?
*   #1 - No Content...
*   #1.5 - How should size be related? Match Parent?
*   #2 - Where will InputFormsUI exist?
*   #3 - What IS InputFormsUI?
*       - Important because, delegation of Responsibility
* */