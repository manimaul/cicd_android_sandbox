package com.willkamp.cicd_android_sanbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("WBK", "hi")
        setContentView(R.layout.activity_main)
    }
}
