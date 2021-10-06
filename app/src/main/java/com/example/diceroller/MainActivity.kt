package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // action after button is clicked
        val rollButton: Button = findViewById(R.id.button)

        // button listener
        rollButton.setOnClickListener {
            rollDice()
        }

        rollDice()

    }

    // roll dice method or function
    private fun rollDice() {
        // number of sides
        val dice = Dice(6)

        // gets dice rol using dice class below
        val diceRoll = dice.roll()

        // gets the image view where dice roll will be displayed
        val diceImage: ImageView = findViewById(R.id.imageView)

        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()
    }
}
// dice class that gets random roll value
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return(1..numSides).random()
    }
}