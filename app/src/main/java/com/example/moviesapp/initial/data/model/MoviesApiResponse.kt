package com.example.moviesapp.initial.data.model

data class MoviesApiResponse (
    val query: String,
    val results: List<Movies>
)