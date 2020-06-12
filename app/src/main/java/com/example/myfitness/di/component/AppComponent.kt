package com.example.myfitness.di.component

import com.example.myfitness.MainApp
import com.example.myfitness.activity.BaseActivity
import com.example.myfitness.di.module.NetworkModule
import com.example.myfitness.di.module.UseCaseModule
import com.example.myfitness.di.module.ViewModeModule

import com.example.myfitness.di.module.ViewModelModuleFactory
import com.example.myfitness.fragment.BaseFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [ NetworkModule::class, UseCaseModule::class, ViewModeModule::class, ViewModelModuleFactory::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun mainApp(application: MainApp): Builder
    }

    fun inject(baseActivity: BaseActivity)
    fun inject(baseFragment: BaseFragment)
}