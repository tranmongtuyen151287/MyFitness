package com.example.myfitness.di.module

import androidx.lifecycle.ViewModel
import com.example.myfitness.di.ViewModelKey
import com.example.myfitness.viewmodels.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModeModule {
    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    fun homeViewModel(viewModel: HomeViewModel): ViewModel
}