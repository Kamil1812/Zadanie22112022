package com.example.zadanie22112022

import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
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

            if (RandomList.size != 0)
            {
                val RandomList_sorted = ArrayList<Int>()

                val s1 = findViewById<Switch>(R.id.switch1)
                val s2 = findViewById<Switch>(R.id.switch2)
                val s3 = findViewById<Switch>(R.id.switch3)
                val s4 = findViewById<Switch>(R.id.switch4)
                val s5 = findViewById<Switch>(R.id.switch5)
                val s6 = findViewById<Switch>(R.id.switch6)
                val s7 = findViewById<Switch>(R.id.switch7)
                val s8 = findViewById<Switch>(R.id.switch8)
                val s9 = findViewById<Switch>(R.id.switch9)

                if (s1.isChecked) {
                    RandomList_sorted.add(s1.text.toString().toInt())
                }

                if (s2.isChecked) {
                    RandomList_sorted.add(s2.text.toString().toInt())
                }

                if (s3.isChecked) {
                    RandomList_sorted.add(s3.text.toString().toInt())
                }

                if (s4.isChecked) {
                    RandomList_sorted.add(s4.text.toString().toInt())
                }

                if (s5.isChecked) {
                    RandomList_sorted.add(s5.text.toString().toInt())
                }

                if (s6.isChecked) {
                    RandomList_sorted.add(s6.text.toString().toInt())
                }

                if (s7.isChecked) {
                    RandomList_sorted.add(s7.text.toString().toInt())
                }

                if (s8.isChecked) {
                    RandomList_sorted.add(s8.text.toString().toInt())
                }

                if (s9.isChecked) {
                    RandomList_sorted.add(s9.text.toString().toInt())
                }

                val dlugosc = RandomList_sorted.size
                val min_dlugosc = dlugosc - 1

               for (j in 0..min_dlugosc)
               {
                   val jj = j+1

                   val current = RandomList_sorted[j].toString().toInt()
                   val next = RandomList_sorted[jj].toString().toInt() // NIE DZIALA

                    if (current > next)
                    {
                        RandomList_sorted[j] = next
                        RandomList_sorted[j+1] = current
                    }
               }

                if (RandomList_sorted.size == 0)
                {
                    findViewById<TextView>(R.id.textView_result).text = "Brak elementów do posortowania"
                }

                else
                {
                    findViewById<TextView>(R.id.textView_result).text = RandomList_sorted.toString()
                }
            }
        }
    }
}