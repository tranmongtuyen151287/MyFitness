package com.example.myfitness.utils

import android.content.Context
import androidx.fragment.app.Fragment
import com.example.myfitness.MainApp

val Fragment.appComponent
    inline get() = (requireActivity().application as MainApp).appComponent

val Context.appComponent
    inline get() = (applicationContext as MainApp).appComponent