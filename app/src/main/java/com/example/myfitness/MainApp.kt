package com.example.myfitness

import android.app.Application
import com.example.myfitness.di.component.DaggerAppComponent


class MainApp : Application() {
    val appComponent = DaggerAppComponent.builder()
        .mainApp(this)
        .build()
}