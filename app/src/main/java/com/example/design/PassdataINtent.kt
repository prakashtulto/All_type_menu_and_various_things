package com.example.design

import android.annotation.SuppressLint
import android.app.Notification.Action
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PassdataINtent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passdata_intent)
    }

    fun openBrowser(view: View) {
         val url="https://WWW.unsplash.com"
         val explicitDialerIntent=Intent(Intent.ACTION_VIEW,Uri.parse(url))
         startActivity(explicitDialerIntent)

    }

    @SuppressLint("SuspiciousIndentation")
    fun openMessage(view: View) {

   val phoneNumber ="1234566785559"
        val message= "hello message"
        val explisitDialerIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("sms",phoneNumber,""))
            explisitDialerIntent.putExtra("sms",message)
            startActivity(explisitDialerIntent)

    }

    fun openDialer(view: View) {
        val phoneNumber ="1234566789"
        val explisitDialerIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
        startActivity(explisitDialerIntent)
    }

}