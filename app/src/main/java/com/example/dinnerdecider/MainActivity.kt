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

            val random = Random()
            val randomIndex = random.nextInt(foodOptions.size)
            val selectedFood = foodOptions[randomIndex]

            tvFood.text = selectedFood
        }

        val btnAddFood = findViewById<Button>(R.id.btnAddFood)
        btnAddFood.setOnClickListener {
            Log.d("BUTTONS", "User tapped the btnAddFood")
        }

        val etFood = findViewById<EditText>(R.id.etFood)

        btnAddFood.setOnClickListener {
            val newFood = etFood.text.toString().trim()

            if (newFood.isNotEmpty()) {
                foodOptions.add(newFood)

                tvFood.text = newFood

                etFood.text.clear()
            }
        }
        
    }



}