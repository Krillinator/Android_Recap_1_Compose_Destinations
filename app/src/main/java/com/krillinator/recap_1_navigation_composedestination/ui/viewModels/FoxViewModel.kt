package com.krillinator.recap_1_navigation_composedestination.ui.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.krillinator.recap_1_navigation_composedestination.api.Fox
import com.krillinator.recap_1_navigation_composedestination.api.FoxRetrofit
import kotlinx.coroutines.launch

class FoxViewModel: ViewModel() {

    // Define a state to hold the fetched fox object
    private val _foxState = mutableStateOf<Fox?>(null)
    val foxState: State<Fox?> = _foxState

    fun fetchFoxImage() {
        viewModelScope.launch {
            try {
                val fox = FoxRetrofit.fetchFox()
                _foxState.value = fox
            } catch (e: Exception) {
                // Handle failure
                println("Network request failed: ${e.message}")
            }
        }
    }

}

