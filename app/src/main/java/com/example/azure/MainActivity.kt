package com.example.azure

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        animate()

        val handler = Handler();

        handler.postDelayed({
            startActivity(Intent(this, Beranda::class.java))
        }, 10000)
    }

    fun animate(){
        val animationl = AlphaAnimation(0.2f, 1.0f)
        animationl.duration = 1000
        animationl.interpolator = LinearInterpolator()
        animationl.repeatCount = 5
        animationl.repeatMode = Animation.REVERSE

        photo_profile.animation = animationl
        text_profile.animation = animationl

    }
}
