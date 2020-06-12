package com.example.myfitness.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope


abstract class BaseViewModel: ViewModel() {
//    protected var isInProgress = MutableLiveData<Boolean>()
//    fun isInProgress() = isInProgress.asImmutable()
//
//    protected var error = MutableLiveData<Throwable>()
//    fun getError() = error.asImmutable()
//
//    protected fun launch(isInProgressLiveData: MutableLiveData<Boolean>? = isInProgress,
//                         errorLiveData: MutableLiveData<Throwable>? = error,
//                         task: suspend CoroutineScope.() -> Unit) {
//        viewModelScope.launch {
//            try {
//                isInProgressLiveData?.value = true
//                task()
//            } catch (throwable: Throwable) {
//                errorLiveData?.value = throwable
//            } finally {
//                isInProgressLiveData?.value = false
//            }
//        }
//    }
}
