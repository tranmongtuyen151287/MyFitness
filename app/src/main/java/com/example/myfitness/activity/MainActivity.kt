package com.example.myfitness.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfitness.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    override fun getLayoutResId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        setContentView(getLayoutResId())
    }
}
