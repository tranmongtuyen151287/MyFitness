package com.example.myfitness.viewmodels

import com.example.myfitness.network.usecase.MainUseCase
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val mainUsecase: MainUseCase
) : BaseViewModel() {

}