package com.example.lolproject.initial.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesapp.initial.data.InitialFragmentRepository
import com.example.moviesapp.initial.data.model.Movies
import kotlinx.coroutines.launch

class InitialFragmentViewModel(private val initialFragmentRepository: InitialFragmentRepository)
    : ViewModel() {
    private var movies: String = ""
    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading
    private val _moviesList = MutableLiveData<List<Movies>>()
    val moviesList: LiveData<List<Movies>> = _moviesList

    fun setMovies(movies: String) {
        this.movies = movies
    }

    fun onSearchButtonClicked(){
        _loading.postValue(true)
        viewModelScope.launch {
            try{
                val response = initialFragmentRepository.searchTitle(movies)
                _moviesList.postValue(response.body()!!.results)
                _loading.postValue(false)
            } catch (e : Exception) {
                _loading.postValue(false)
            }
        }
    }
}