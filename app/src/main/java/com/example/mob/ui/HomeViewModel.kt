package com.example.mob.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {
    val msg: MutableStateFlow<String> = MutableStateFlow("")
    suspend fun fetchData(): String {
        delay(1000L)
        return "hello world"
    }
    fun loadMessage() {
        viewModelScope.launch {
            msg.value = "helloStateFlow"
        }
    }
}