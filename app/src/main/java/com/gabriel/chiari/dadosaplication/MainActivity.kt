package com.gabriel.chiari.dadosaplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val rollButton: Button = findViewById(R.id.btnRoll)
        rollButton.setOnClickListener { rollDice() }
    }
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)

        // Update the screen with the dice roll
        val diceImage1: ImageView = findViewById(R.id.ivDice1)
        diceImages(dice.roll(),diceImage1)


        // Update the screen with the dice roll
        val diceImage2: ImageView = findViewById(R.id.ivDice2)
        diceImages(dice.roll(),diceImage2)
    }

    private fun diceImages(number: Int,imageView: ImageView){
        when(number){
            1 -> imageView.setImageResource(R.drawable.dice_1)
            2 -> imageView.setImageResource(R.drawable.dice_2)
            3 -> imageView.setImageResource(R.drawable.dice_3)
            4 -> imageView.setImageResource(R.drawable.dice_4)
            5 -> imageView.setImageResource(R.drawable.dice_5)
            6 -> imageView.setImageResource(R.drawable.dice_6)
        }
    }


}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}