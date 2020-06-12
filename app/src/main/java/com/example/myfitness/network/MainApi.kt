package com.example.myfitness.network

import retrofit2.http.GET

interface MainApi {

    @GET("")
    suspend fun getUserProfile()
}