package com.example.moviesapp
import com.example.lolproject.initial.presentation.InitialFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    viewModel {
        InitialFragmentViewModel()
    }
}