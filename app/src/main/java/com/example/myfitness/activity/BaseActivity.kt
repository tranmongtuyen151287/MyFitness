package com.example.myfitness.activity

import android.app.Dialog
import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import com.example.myfitness.di.ViewModelFactory
import com.example.myfitness.utils.appComponent

abstract class BaseActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private var progressDialog: Dialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        appComponent.inject(this)

        registerObser()

        initView()
    }

    override fun onDestroy() {
        super.onDestroy()
        progressDialog?.dismiss()
    }

    fun displayLoading(isShown: Boolean) {
        if (isShown) {
            showLoading()
        } else {
            hideLoading()
        }
    }

    fun showLoading() {
        //progressDialog = this.showProgressDialog()
    }

    fun hideLoading() {
        progressDialog?.let {
            if (it.isShowing) {
                it.dismiss()
            }
        }
    }

    inline fun <reified VM : ViewModel> getViewModel() =
        ViewModelProvider(this, viewModelFactory).get(VM::class.java)

    open fun registerObser() {}

    open fun onReload() {}

    open fun onGetUnreadNotiCount() {}

    @LayoutRes
    abstract fun getLayoutResId(): Int

    protected abstract fun initView()
}