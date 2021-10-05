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
            val resultTextView: TextView = findViewById(R.id.textView2)

            // set the value of the resultTextView to be displayed
            resultTextView.text = "6"

            // display Toast (brief message) - A toast is a view containing a quick little message for the user.
            /*val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()*/
            // can also be written as - Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        }
    }
}