package com.example.design

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class IntentActivity : AppCompatActivity() {

//    lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)



//   val   buttonexplicit= findViewById<Button>(R.id.explicitIntent)
//
//
//        buttonexplicit.setOnClickListener {
//
//
//            val explisitIntent = Intent(this,secondIntentActivity::class.java)
//            startActivity(explisitIntent)
//
//        }
//


    }



//implisit(pata nahi ha kaha jana ha )
    fun ImplicitINtent(view: View) {

         val implisitintent = Intent(Intent.ACTION_VIEW)

        startActivity(Intent.createChooser(implisitintent,"implisit"))


    }


    //explicit Intent(pata hai kaha jana hai)
    @SuppressLint("SuspiciousIndentation")
    fun openSecondActivity(view: View) {



        val explisitIntent = Intent(this,secondIntentActivity::class.java)
          startActivity(explisitIntent)

    }


}