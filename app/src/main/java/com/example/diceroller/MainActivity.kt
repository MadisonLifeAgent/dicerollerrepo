package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // action after button is clicked
        val rollButton: Button = findViewById(R.id.button)

        // button listener
        rollButton.setOnClickListener {
            // this is where the dice roll where be stored and how it will be displayed
            //val resultTextView: TextView = findViewById(R.id.textView2)

            // set the value of the resultTextView to be displayed
            rollDice()

            // display Toast (brief message) - A toast is a view containing a quick little message for the user.
            /*val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()*/
            // can also be written as - Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        }
    }

    // roll dice method or function
    private fun rollDice() {
        // number of sides
        val dice = Dice(6)

        // gets dice rol using dice class below
        val diceRoll = dice.roll()

        // gets the text view where dice roll will be displayed
        val resultTextView: TextView = findViewById(R.id.textView2)

        // converts dice roll to string for display in textview
        resultTextView.text = diceRoll.toString()
    }
}
// dice class that gets random roll value
class Dice(val numSides: Int) {
    fun roll(): Int {
        return(1..numSides).random()
    }
}