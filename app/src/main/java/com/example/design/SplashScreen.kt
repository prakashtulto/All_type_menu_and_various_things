package com.example.design

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.DisplayMetrics
import android.view.animation.TranslateAnimation
import android.widget.ImageView

class SplashScreen : AppCompatActivity() {

    private lateinit var splashImageView: ImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        splashImageView=findViewById(R.id.splash_logo)


        // Get the width of the screen
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val widthPixels = displayMetrics.widthPixels


        // Create a translate animation that will move the image from the right side of the screen to the left side
        val imageAnimation = TranslateAnimation(
            widthPixels.toFloat(),
            0F,
            0F,
            0F
        )
        imageAnimation.duration = 1500
        imageAnimation.repeatCount = 0
        imageAnimation.fillAfter = true

        // Start the animation
        splashImageView.startAnimation(imageAnimation)


        Handler().postDelayed({
            val intent= Intent(Intent(this,MainActivity::class.java))
            startActivity(intent)
            finish()
        },3000
        )


    }

}



