package com.example.myfitness.di.module

import com.example.myfitness.network.impl.MainUsecaseImpl
import com.example.myfitness.network.usecase.MainUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface UseCaseModule {
    @Binds
    fun mainUseCase(mainUsecaseImpl: MainUsecaseImpl): MainUseCase
}