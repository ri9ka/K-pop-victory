package com.example.kpopvictory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnStart(view: View) {
        val intent : Intent = Intent(this, ChooseActivity::class.java)
        startActivity(intent)
    }

    fun group(view: View) {
        val intent : Intent = Intent(this, About::class.java)
        startActivity(intent)
    }

    fun app(view: View) {
        val intent : Intent = Intent(this, app::class.java)
        startActivity(intent)
    }
}