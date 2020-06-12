package com.example.myfitness.network.impl

import com.example.myfitness.network.MainApi
import com.example.myfitness.network.usecase.MainUseCase
import javax.inject.Inject

class MainUsecaseImpl @Inject constructor(
    private val mainApi: MainApi
): MainUseCase {
    override suspend fun getUserProfile() {
        mainApi.getUserProfile()
    }
}