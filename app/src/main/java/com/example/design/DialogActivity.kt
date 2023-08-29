package com.example.design

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.res.ResourcesCompat
import com.example.design.databinding.ActivityDialogBinding
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle

class DialogActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDialogBinding


    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)


       binding.button.setOnClickListener {


           //CustomDialogToast
//           Toast.makeText(this,"Hii i am toast",Toast.LENGTH_SHORT).show()

//           MotionToast.darkToast(this,
//               "Hurray success 😍",
//               "Upload Completed successfully!",
//               MotionToastStyle.SUCCESS,
//               MotionToast.GRAVITY_BOTTOM,
//               MotionToast.LONG_DURATION,
//               ResourcesCompat.getFont(this, R.font.roboto_light))
//
//
//        }

        val alertDialog =AlertDialog.Builder(this)
           alertDialog.setTitle("delete")
           alertDialog.setCancelable(false)
           alertDialog.setMessage("Are you want to sure to delete this file")
           alertDialog.setPositiveButton("yes",DialogInterface.OnClickListener { dialog, which ->

               MotionToast.createToast(this,

               "Delete",
               "Deleted Succesfully",
               MotionToastStyle.SUCCESS,
               MotionToast.GRAVITY_BOTTOM,
               MotionToast.LONG_DURATION,
               ResourcesCompat.getFont(this, R.font.roboto_light))


           })
           alertDialog.setNeutralButton("cancel",DialogInterface.OnClickListener { dialog, which ->

               MotionToast.createToast(this,

                   "Delete",
                   "Deleted Succesfully",
                   MotionToastStyle.DELETE,
                   MotionToast.GRAVITY_BOTTOM,
                   MotionToast.LONG_DURATION,
                   ResourcesCompat.getFont(this, R.font.roboto_light))


           })


        alertDialog.show()



    }
}
    }