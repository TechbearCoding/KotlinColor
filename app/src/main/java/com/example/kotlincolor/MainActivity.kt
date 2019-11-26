package com.example.kotlincolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isRed : Boolean = false
    private var isGreen : Boolean = false
    private var isBlue : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRed.setBackgroundColor(Color.GRAY)
        btnGreen.setBackgroundColor(Color.GRAY)
        btnBlue.setBackgroundColor(Color.GRAY)
        btnSum.setBackgroundColor(Color.GRAY)

        btnRed.setOnClickListener {
            if(!isRed)
                btnRed.setBackgroundColor(Color.RED)
            else
                btnRed.setBackgroundColor(Color.GRAY)

            isRed = !isRed
            btnSum.changeMixColor()
        }

        btnGreen.setOnClickListener {
            if(!isGreen)
                btnGreen.setBackgroundColor(Color.GREEN)
            else
                btnGreen.setBackgroundColor(Color.GRAY)

            isGreen = !isGreen
            btnSum.changeMixColor()
        }

        btnBlue.setOnClickListener {
            if(!isBlue)
                btnBlue.setBackgroundColor(Color.BLUE)
            else
                btnBlue.setBackgroundColor(Color.GRAY)
            isBlue = !isBlue
            btnSum.changeMixColor()
        }

        btnSum.setOnClickListener {

            var loopObj = Loops()

//            var result
            Toast.makeText(applicationContext,loopObj.getResult(), Toast.LENGTH_SHORT).show()
        }

    }

    private fun Button.changeMixColor(){

        var sum : String = isRed.toInt().toString() + isGreen.toInt().toString() +
                isBlue.toInt().toString()

        when(sum){
            "000" -> this.setBackgroundColor(Color.GRAY)
            "001" -> this.setBackgroundColor(Color.BLUE)
            "010" -> this.setBackgroundColor(Color.GREEN)
            "100" -> this.setBackgroundColor(Color.RED)
            "011" -> this.setBackgroundColor(Color.CYAN)
            "101" -> this.setBackgroundColor(Color.MAGENTA)
            "110" -> this.setBackgroundColor(Color.YELLOW)
            "111" -> this.setBackgroundColor(Color.WHITE)

        }
    }



    private fun Boolean.toInt() = if (this) 1 else 0

}
