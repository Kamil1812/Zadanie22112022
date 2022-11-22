package com.example.zadanie22112022

import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RandomList = ArrayList<Int>()

        for (i in 0..8)
        {
            RandomList.add(Random.nextInt(0, 100))
        }

        findViewById<Button>(R.id.btn_random).setOnClickListener {

            findViewById<Switch>(R.id.switch1).text = RandomList[0].toString()
            findViewById<Switch>(R.id.switch2).text = RandomList[1].toString()
            findViewById<Switch>(R.id.switch3).text = RandomList[2].toString()
            findViewById<Switch>(R.id.switch4).text = RandomList[3].toString()
            findViewById<Switch>(R.id.switch5).text = RandomList[4].toString()
            findViewById<Switch>(R.id.switch6).text = RandomList[5].toString()
            findViewById<Switch>(R.id.switch7).text = RandomList[6].toString()
            findViewById<Switch>(R.id.switch8).text = RandomList[7].toString()
            findViewById<Switch>(R.id.switch9).text = RandomList[8].toString()
        }

        findViewById<Button>(R.id.btn_sort).setOnClickListener {

        }
    }
}