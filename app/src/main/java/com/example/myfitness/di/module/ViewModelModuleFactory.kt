package com.example.myfitness.di.module

import androidx.lifecycle.ViewModelProvider
import com.example.myfitness.di.ViewModelFactory
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface ViewModelModuleFactory {
    @Binds
    @Singleton
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}