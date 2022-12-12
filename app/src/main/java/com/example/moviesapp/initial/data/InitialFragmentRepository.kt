package com.example.moviesapp.initial.data

import com.example.moviesapp.initial.APIs.MoviesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import retrofit2.Response

class InitialFragmentRepository(private val moviesApi: MoviesApi) {
    suspend fun searchTitle(title: String) : Response<ResponseBody> {
        return withContext(Dispatchers.IO) {
            return@withContext moviesApi.findTitle(title)
        }
    }
}