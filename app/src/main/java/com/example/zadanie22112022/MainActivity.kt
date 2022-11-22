package com.example.zadanie22112022

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_random).setOnClickListener {

            for (i in 1..9)
            {

            }
        }

        findViewById<Button>(R.id.btn_sort).setOnClickListener {

        }
    }
}