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
    }

    // roll dice method or function
    private fun rollDice() {
        // number of sides
        val dice = Dice(6)

        // gets dice rol using dice class below
        val diceRoll = dice.roll()

        // gets the text view where dice roll will be displayed
        val resultImageView: ImageView = findViewById(R.id.imageView)

        // converts dice roll to string for display in textview
        //resultImageView = diceRoll.toString()
    }
}
// dice class that gets random roll value
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return(1..numSides).random()
    }
}