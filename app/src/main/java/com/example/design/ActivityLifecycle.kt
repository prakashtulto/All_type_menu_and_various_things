package com.example.design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityLifecycle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Perform initialization tasks here



    }
}