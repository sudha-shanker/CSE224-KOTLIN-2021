package com.example.cse224_kotlin_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class CheckBoxExample : AppCompatActivity() {
    lateinit var pizza: CheckBox
    lateinit var coffee: CheckBox
    lateinit var burger: CheckBox
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box_example)
        pizza = findViewById(R.id.checkBox1)
        coffee = findViewById(R.id.checkBox2)
        burger = findViewById(R.id.checkBox3)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            var totalAmount: Int = 0
            val result = StringBuilder()
            result.append("Selected Items")
            if (pizza.isChecked) {
                result.append("\nPizza 100Rs")
                totalAmount += 100
            }
            if (coffee.isChecked) {
                result.append("\nCoffee 50Rs")
                totalAmount += 50
            }
            if (burger.isChecked) {
                result.append("\nBurger 120Rs")
                totalAmount += 120
            }
            result.append("\nTotal: " + totalAmount + "Rs")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}