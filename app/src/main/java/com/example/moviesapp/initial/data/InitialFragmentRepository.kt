package com.example.moviesapp.initial.data

import com.example.moviesapp.apis.MoviesApi
import com.example.moviesapp.initial.data.model.Movies
import com.example.moviesapp.initial.data.model.MoviesApiResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import retrofit2.Response

class InitialFragmentRepository(private val moviesApi: MoviesApi) {
    suspend fun searchTitle(title: String) : Response<MoviesApiResponse> {
        return withContext(Dispatchers.IO) {
            return@withContext moviesApi.findTitle(title)
        }
    }
}