package com.example.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var imgResult: ImageView
    lateinit var txtValue: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.btnRoll)
        txtValue = findViewById(R.id.txtDiceValue)
        imgResult = findViewById(R.id.imgDiceResult)

        btn.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice(){

        val randomInt = (Random.nextInt(6) + 1)
        val drawableResource = chooseImg(randomInt)

        Toast.makeText(this, "You clicked2", Toast.LENGTH_SHORT).show()
        imgResult.setImageResource(drawableResource)

        txtValue.text = randomInt.toString()
        Log.i("random val", "${(Random.nextInt(6) + 1)}")
    }

    private fun chooseImg(randomInt: Int): Int {
        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }


}