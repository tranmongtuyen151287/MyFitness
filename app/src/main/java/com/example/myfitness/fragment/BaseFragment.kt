package com.example.myfitness.fragment

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myfitness.di.ViewModelFactory
import com.example.myfitness.utils.appComponent
import javax.inject.Inject

abstract class BaseFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory


    private var progressDialog: Dialog? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayoutResId(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        appComponent.inject(this)

        registerObser()

        initView()
    }

    fun displayLoading(isShown: Boolean) {
        if (isShown) {
            showLoading()
        } else {
            hideLoading()
        }
    }

    fun showLoading() {
        //progressDialog = this.requireContext().showProgressDialog()
    }

    fun hideLoading() {
        progressDialog?.let {
            if (it.isShowing) {
                it.dismiss()
            }
        }
    }

    inline fun <reified T : ViewModel> getFragmentViewModel(): T {
        return ViewModelProvider(this, viewModelFactory).get(T::class.java)
    }

    inline fun <reified T : ViewModel> getActivityViewModel(): T {
        return ViewModelProvider(requireActivity(), viewModelFactory).get(T::class.java)
    }

    open fun registerObser() {}

    abstract fun getLayoutResId(): Int

    abstract fun initView()
}