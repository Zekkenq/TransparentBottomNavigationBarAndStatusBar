package com.example.transparentnavigationbar

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.apply {

            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

        }
    }
}