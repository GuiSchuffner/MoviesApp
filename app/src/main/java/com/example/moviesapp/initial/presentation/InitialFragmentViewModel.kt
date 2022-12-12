package com.example.lolproject.initial.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesapp.initial.data.InitialFragmentRepository
import kotlinx.coroutines.launch

class InitialFragmentViewModel(private val initialFragmentRepository: InitialFragmentRepository)
    : ViewModel() {
    private var movies: String = ""

    fun setPlayerId(id: String) {
        movies=id
    }

    fun onSearchButtonClicked(){
        viewModelScope.launch {
            try{
                val response = initialFragmentRepository.searchTitle(movies)
            } catch (e : Exception) {
                e.message
            }

        }
    }
}