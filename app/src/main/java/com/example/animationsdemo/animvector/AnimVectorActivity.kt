package com.example.animationsdemo.animvector

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.example.animationsdemo.R
import kotlinx.android.synthetic.main.activity_anim_vector.*

class AnimVectorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anim_vector)

        var isChecked=true


        avdImage.setOnClickListener{
            if (isChecked)
                checkToClose()
            else
                closeToCheck()
            isChecked=!isChecked
        }
    }

    private fun closeToCheck() {
        avdImage.setImageResource(R.drawable.avd_close_to_check)
        val avdCheckToClose:AnimatedVectorDrawable=avdImage.drawable as AnimatedVectorDrawable
        avdCheckToClose.start()
    }

    private fun checkToClose() {
       avdImage.setImageResource(R.drawable.avd_check_to_close)
        val avdCheckToClose:AnimatedVectorDrawable=avdImage.drawable as AnimatedVectorDrawable
        avdCheckToClose.start()
    }
}
