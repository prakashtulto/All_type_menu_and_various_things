package com.example.design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("lifecycle","onCreate invoked");
    }

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle","onStart invoked");
    }

    override fun onResume() {
        super.onResume()
        // The activity has become visible (it is now "resumed")

        Log.d("lifecycle","onResume invoked");
    }

    override fun onPause() {
        super.onPause()
        // Another activity is taking focus (this activity is about to be "paused")
        Log.d("lifecycle","onPause invoked");
    }

    override fun onStop() {
        super.onStop()
        // The activity is no longer visible (it is now "stopped")
        Log.d("lifecycle","onStop invoked");
    }

    override fun onDestroy() {
        super.onDestroy()
        // The activity is about to be destroyed

        Log.d("lifecycle","onDestroy invoked");
    }
}