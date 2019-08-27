package com.example.animationsdemo.frameanim

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import com.example.animationsdemo.R
import kotlinx.android.synthetic.main.activity_frame_anim.*

class FrameAnimActivity : AppCompatActivity() {
    lateinit var wifiAnimation:AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_anim)


    }

    // Button click event handler
    fun startStopAnimation(view: View) {
if(wifiAnimation.isRunning)
    wifiAnimation.stop()
        else
    wifiAnimation.start()
    }

    override fun onStart() {
        super.onStart()
        targetImage.setBackgroundResource(R.drawable.wifi_animation_list)
        wifiAnimation=targetImage.background as AnimationDrawable
        wifiAnimation.start()
    }
}
