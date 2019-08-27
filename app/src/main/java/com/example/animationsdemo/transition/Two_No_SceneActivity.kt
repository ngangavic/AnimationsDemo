package com.example.animationsdemo.transition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import android.transition.Slide
import android.transition.TransitionManager
import android.view.Gravity
import android.view.View
import com.example.animationsdemo.R
import kotlinx.android.synthetic.main.activity_two__no__scene.*

class Two_No_SceneActivity : AppCompatActivity() {

    private var visibility = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two__no__scene)
    }

    fun fadeAnimation(view: View) {
        val transition = Fade()

        TransitionManager.beginDelayedTransition(sceneRoot,transition)
        txvDescription.visibility=if(visibility)View.INVISIBLE else View.VISIBLE
        visibility = !visibility

    }

    fun slideEffect(view: View) {

        val transition = Slide(Gravity.BOTTOM)
        TransitionManager.beginDelayedTransition(sceneRoot, transition)

        txvDescription.visibility = if (visibility) View.INVISIBLE else View.VISIBLE
        visibility = !visibility
    }
}
