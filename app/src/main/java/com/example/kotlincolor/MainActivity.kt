package com.example.kotlincolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isRed : Boolean = false
    var isGreen : Boolean = false
    var isBlue : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRed.setBackgroundColor(Color.GRAY)
        btnGreen.setBackgroundColor(Color.GRAY)
        btnBlue.setBackgroundColor(Color.GRAY)

        btnRed.setOnClickListener {
            if(!isRed) {
                btnRed.setBackgroundColor(Color.RED)
                isRed = true
            }
            else {
                btnRed.setBackgroundColor(Color.GRAY)
                isRed = false
            }
        }

        btnGreen.setOnClickListener {
            if(!isGreen) {
                btnGreen.setBackgroundColor(Color.GREEN)
                isGreen = true
            }
            else {
                btnGreen.setBackgroundColor(Color.GRAY)
                isGreen = false
            }
        }

        btnBlue.setOnClickListener {
            if(!isBlue) {
                btnBlue.setBackgroundColor(Color.BLUE)
                isBlue = true
            }
            else {
                btnBlue.setBackgroundColor(Color.GRAY)
                isBlue = false
            }
        }

    }

}
