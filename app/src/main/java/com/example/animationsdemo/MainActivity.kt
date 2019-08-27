package com.example.animationsdemo

import android.animation.Animator
import android.animation.AnimatorInflater
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.animationsdemo.animvector.AnimVectorActivity
import com.example.animationsdemo.applyanims.KeyFrameActivity
import com.example.animationsdemo.frameanim.FrameAnimActivity
import com.example.animationsdemo.transition.TwoLayoutsActivity
import com.example.animationsdemo.transition.Two_No_SceneActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),Animator.AnimatorListener {

    private var rotateAnimator:Animator?=null
    private var scaleAnimator:Animator?=null
    private var translateAnimator:Animator?=null
    private var fadeAnimator:Animator?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.code -> {
                val intent = Intent(this@MainActivity, CodeActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.frame_anim->{
                val intent = Intent(this@MainActivity,FrameAnimActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.anim_vector->{
                val intent = Intent(this@MainActivity, AnimVectorActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.two_l_trans->{
                val intent = Intent(this@MainActivity,TwoLayoutsActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.two_l_trans_no->{
                val intent = Intent(this@MainActivity,Two_No_SceneActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.keyframe->{
                val intent = Intent(this@MainActivity,KeyFrameActivity::class.java)
                startActivity(intent)
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_list, menu)
        val menuItem= menu?.findItem(R.id.code)
        return true
    }

    fun rotateAnimation(view: View) {

        rotateAnimator = AnimatorInflater.loadAnimator(this, R.animator.rotate)
        rotateAnimator?.apply {
            setTarget(targetImage)
            addListener(this@MainActivity)
            start()
        }
    }

    fun scaleAnimation(view: View) {

        scaleAnimator = AnimatorInflater.loadAnimator(this, R.animator.scale)
        scaleAnimator?.apply {
            setTarget(targetImage)
            addListener(this@MainActivity)
            start()
        }
    }

    fun translateAnimation(view: View) {

        translateAnimator = AnimatorInflater.loadAnimator(this, R.animator.translate)
        translateAnimator?.apply {
            setTarget(targetImage)
            addListener(this@MainActivity)
            start()
        }
    }

    fun fadeAnimation(view: View) {

        fadeAnimator = AnimatorInflater.loadAnimator(this, R.animator.alpha)
        fadeAnimator?.apply {
            setTarget(targetImage)
            addListener(this@MainActivity)
            start()
        }
    }

    // Implementation of AnimatorListener interface
    override fun onAnimationStart(animation: Animator?) {

        if (animation == scaleAnimator)
            Toast.makeText(this, "Scale Animation Started", Toast.LENGTH_SHORT).show()

        if (animation == rotateAnimator)
            Toast.makeText(this, "Rotate Animation Started", Toast.LENGTH_SHORT).show()

        if (animation == translateAnimator)
            Toast.makeText(this, "Translate Animation Started", Toast.LENGTH_SHORT).show()

        if (animation == fadeAnimator)
            Toast.makeText(this, "Fade Animation Started", Toast.LENGTH_SHORT).show()
    }

    override fun onAnimationRepeat(animation: Animator?) {

        Toast.makeText(this, "Animation Repeated", Toast.LENGTH_SHORT).show()
    }

    override fun onAnimationEnd(animation: Animator?) {

        Toast.makeText(this, "Animation Ended", Toast.LENGTH_SHORT).show()
    }

    override fun onAnimationCancel(animation: Animator?) {

        Toast.makeText(this, "Animation Cancelled", Toast.LENGTH_SHORT).show()
    }

    fun setFromXML(view: View) {

        val animator = AnimatorInflater.loadAnimator(this, R.animator.set)
        animator.apply {
            setTarget(targetImage)
            start()
        }
    }

}
