package com.example.architecturecomponents.view_model

import androidx.lifecycle.ViewModel

class MainViewModel(increment:Int ):ViewModel() {

    var count:Int =increment

    fun increment() {
        count++
    }

}