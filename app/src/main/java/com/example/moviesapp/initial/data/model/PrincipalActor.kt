package com.example.moviesapp.initial.data.model

data class PrincipalActor(
    val id: String,
    val legacyNameText: String,
    val category: String,
    val characters: List<String>,
    val endYear: Int,
    val episodeCount: Int,
    val startYear: Int
)
