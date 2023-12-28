package com.example.kpopvictory

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.ProgressBar
import android.widget.TextView

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val Splash : Long = 3000

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val tv : TextView = findViewById(R.id.textView)

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },Splash)

        val animator = ObjectAnimator.ofArgb(
            tv, "textColor",
            0xFF000000.toInt(),
            0xFFB5B5B5.toInt()
        ).apply {
            duration = 3000
            interpolator = AccelerateDecelerateInterpolator()
            repeatCount = ObjectAnimator.INFINITE
            repeatMode = ObjectAnimator.REVERSE
        }

        animator.start()

    }
}