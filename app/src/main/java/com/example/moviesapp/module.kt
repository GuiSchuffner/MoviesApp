package com.example.moviesapp
import com.example.lolproject.initial.presentation.InitialFragmentViewModel
import com.example.moviesapp.initial.APIs.MoviesApi
import com.example.moviesapp.initial.data.InitialFragmentRepository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    viewModel {
        InitialFragmentViewModel(get())
    }
    factory {
        MoviesApi.create()
    }
    factory {
        InitialFragmentRepository(get())
    }
}