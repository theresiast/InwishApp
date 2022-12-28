package com.example.inwishapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splasch_screen : AppCompatActivity() {
    private val SPLASH TIME: Long : 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splasch_screen)

        Handler().postDelayed({
            startActivity(intent(this, MainActivity)

        })


    }
}