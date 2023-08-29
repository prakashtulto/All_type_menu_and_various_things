package com.example.design

import android.R
import android.widget.MediaController
import android.os.Bundle
import android.view.View
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.design.databinding.ActivityMediaBinding


class MediaActivity : AppCompatActivity() {

//    binding eneble 1st tarika
//    private lateinit var binding: ActivityMediaBinding

//        videoView.setVideoPath("http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4")
//        videoView.start()
//


    val binding by lazy {

        ActivityMediaBinding.inflate(layoutInflater)
    }

//    var indexer =0

   lateinit var mediaController: MediaController
    var longlist= arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var longlist= arrayListOf<String>()

        longlist.add("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4")
        longlist.add("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4")
        longlist.add("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4")



        mediaController = MediaController(this@MediaActivity)


    }

}