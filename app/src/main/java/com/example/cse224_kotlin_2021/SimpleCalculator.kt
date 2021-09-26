package com.example.cse224_kotlin_2021

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SimpleCalculator : AppCompatActivity() {
    var ans:Double=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_calculator)

        val no1 = findViewById<EditText>(R.id.first_no)
        val no2 = findViewById<EditText>(R.id.second_no)
        val add = findViewById<Button>(R.id.add)
        val sub = findViewById<Button>(R.id.sub)
        val mul = findViewById<Button>(R.id.mul)
        val div = findViewById<Button>(R.id.div)
        val equal = findViewById<Button>(R.id.equals)
        val answer = findViewById<TextView>(R.id.answer)
        val oper = findViewById<TextView>(R.id.operation)

        add.setOnClickListener {
            if(no1.text.toString().isEmpty()||no2.text.toString().isEmpty())
                Toast.makeText(applicationContext,"Enter Numbers",Toast.LENGTH_SHORT).show()
            else {
                val a: Double = no1.text.toString().toDouble()
                val b: Double = no2.text.toString().toDouble()
                ans = a + b
                oper.text = "Addition"
            }
        }
        sub.setOnClickListener {
            if(no1.text.toString().isEmpty()||no2.text.toString().isEmpty())
                Toast.makeText(applicationContext,"Enter Numbers",Toast.LENGTH_SHORT).show()
            else {
                val a: Double = no1.text.toString().toDouble()
                val b: Double = no2.text.toString().toDouble()
                ans = a - b
                oper.text = "Subtraction"
            }
        }
        mul.setOnClickListener {
            if(no1.text.toString().isEmpty()||no2.text.toString().isEmpty())
                Toast.makeText(applicationContext,"Enter Numbers",Toast.LENGTH_SHORT).show()
            else {
                val a: Double = no1.text.toString().toDouble()
                val b: Double = no2.text.toString().toDouble()
                ans = a * b
                oper.text = "Multiply"
            }
        }
        div.setOnClickListener {
            if(no1.text.toString().isEmpty()||no2.text.toString().isEmpty())
                Toast.makeText(applicationContext,"Enter Numbers",Toast.LENGTH_SHORT).show()
            else {
                val a: Double = no1.text.toString().toDouble()
                val b: Double = no2.text.toString().toDouble()
                if(b!=0.0) {
                    ans = a / b
                    oper.text = "Division"
                }
                else
                    Toast.makeText(applicationContext,"Division by zero",Toast.LENGTH_SHORT).show()
            }
        }
        equal.setOnClickListener {
            if(no1.text.toString().isEmpty()||no2.text.toString().isEmpty())
                Toast.makeText(applicationContext,"Enter Numbers",Toast.LENGTH_SHORT).show()
            else {
                var ans1: String = ans.toString()
                answer.text = ans1
                ans = 0.0
                oper.text = " "
            }
        }

    }
}