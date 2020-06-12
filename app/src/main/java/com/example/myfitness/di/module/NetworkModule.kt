package com.example.myfitness.di.module

import com.example.myfitness.activity.MainActivity
import com.example.myfitness.network.MainApi
import dagger.Binds
import dagger.Module
import dagger.Provides
import okhttp3.Authenticator
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    fun mainApi(): MainApi {
        return Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(MainApi::class.java)
    }
}