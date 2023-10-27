package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    private val foodOptions = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDecide = findViewById<Button>(R.id.btnDecide)
        val tvFood = findViewById<TextView>(R.id.tvFood)

        btnDecide.setOnClickListener {
            Log.d("BUTTONS", "User tapped the btnDecide")

            // Select a random food item from the ArrayList
            val random = Random()
            val randomIndex = random.nextInt(foodOptions.size)
            val selectedFood = foodOptions[randomIndex]

            // Update the TextView with the selected food
            tvFood.text = selectedFood
        }

        val btnAddFood = findViewById<Button>(R.id.btnAddFood)
        btnAddFood.setOnClickListener {
            Log.d("BUTTONS", "User tapped the btnAddFood")
        }

        val etFood = findViewById<EditText>(R.id.etFood)

        btnAddFood.setOnClickListener {
            // Get the user's input from the EditText
            val newFood = etFood.text.toString().trim()

            if (newFood.isNotEmpty()) {
                // Add the user's choice to the ArrayList
                foodOptions.add(newFood)

                // Update the TextView with the user's choice
                tvFood.text = newFood

                // Clear the EditText for the next input
                etFood.text.clear()
            }
        }
        
    }



}