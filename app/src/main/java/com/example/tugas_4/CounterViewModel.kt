package com.example.tugas_4

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var count by mutableIntStateOf(0)
        private set

    fun increment() { count++ }
    fun decrement() { count-- }
    fun reset() { count = 0 }
}