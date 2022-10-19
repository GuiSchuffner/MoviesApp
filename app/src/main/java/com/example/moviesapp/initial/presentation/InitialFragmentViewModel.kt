package com.example.lolproject.initial.presentation

import androidx.lifecycle.ViewModel

class InitialFragmentViewModel : ViewModel() {
    private var playerId: String = ""

    fun setPlayerId(id: String) {
        playerId=id
    }

    fun onSearchButtonClicked(){
        var a = "aaa"
    }
}