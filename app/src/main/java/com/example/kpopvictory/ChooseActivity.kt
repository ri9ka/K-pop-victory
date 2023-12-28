package com.example.kpopvictory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ChooseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)
    }

    fun txt(view: View) {
        val intent : Intent = Intent(this, Txt::class.java)
        startActivity(intent)
    }
    fun straykids(view: View) {
        val intent : Intent = Intent(this, StrayKids::class.java)
        startActivity(intent)
    }
    fun gidle(view: View) { val intent : Intent = Intent(this, gidle::class.java)
        startActivity(intent)}
    fun seventeen(view: View) {
        val intent : Intent = Intent(this, Seventeen::class.java)
        startActivity(intent)
    }
}