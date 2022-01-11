package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }


    private fun setListeners() {
        val box_one_text: View = findViewById<TextView>(R.id.box_one_text)
        val box_two_text: View = findViewById<TextView>(R.id.box_two_text)
        val box_three_text: View = findViewById<TextView>(R.id.box_three_text)
        val box_four_text: View = findViewById<TextView>(R.id.box_four_text)
        val box_five_text: View = findViewById<TextView>(R.id.box_five_text)
        val layout: View = findViewById(R.id.constraint_layout)
        val redButton: Button = findViewById(R.id.red_button)
        val yellowButton: Button = findViewById(R.id.yellow_button)
        val greenButton: Button = findViewById(R.id.green_button)

        /*
        val clickableViews: List<View> = listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text)
        for (item in clickableViews) {
            item.setOnClickListener{ makeColored(it) }
        }*/

        box_one_text.setOnClickListener { it.setBackgroundColor(Color.DKGRAY) }
        box_two_text.setOnClickListener{ it.setBackgroundColor(Color.GRAY) }
        box_three_text.setOnClickListener { it.setBackgroundResource(android.R.color.holo_green_light) }
        box_four_text.setOnClickListener { it.setBackgroundResource(android.R.color.holo_green_dark) }
        box_five_text.setOnClickListener { it.setBackgroundResource(android.R.color.holo_green_light) }

        layout.setOnClickListener { it.setBackgroundColor(Color.LTGRAY) }

        redButton.setOnClickListener { box_three_text.setBackgroundResource(R.color.my_red) }
        yellowButton.setOnClickListener { box_four_text.setBackgroundResource(R.color.my_yellow) }
        greenButton.setOnClickListener { box_five_text.setBackgroundResource(R.color.my_green) }
    }

    // Questo non funziona
    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}