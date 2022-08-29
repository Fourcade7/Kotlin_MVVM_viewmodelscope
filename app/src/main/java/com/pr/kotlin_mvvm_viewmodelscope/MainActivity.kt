package com.pr.kotlin_mvvm_viewmodelscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.pr.kotlin_mvvm_viewmodelscope.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        val textView=findViewById<TextView>(R.id.textview1)

        mainViewModel.getAllData()

        mainViewModel.livedatacar.observe(this,  {
            Log.d("PR7", "onCreate: ${it.name} ${it.number}")
            textView.text="${it.name} ${it.number}"
        })
    }
}