package com.example.lanzapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var imgDice : ImageView
    lateinit var imgDice2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn : Button = findViewById(R.id.btn_dice)
        imgDice = findViewById(R.id.img_dice)
        imgDice2 = findViewById(R.id.img_dice2)
        rollBtn.setOnClickListener{
            roll(imgDice)
            roll(imgDice2)

        }
    }

    fun roll(imagen : ImageView){
        val randomInt = Random().nextInt(6) +1
        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        imagen.setImageResource(drawableResource)

        Log.d("Lanzapp","Click!")
    }
}
