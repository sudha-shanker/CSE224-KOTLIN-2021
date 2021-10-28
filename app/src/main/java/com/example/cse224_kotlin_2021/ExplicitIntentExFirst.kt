package com.example.cse224_kotlin_2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExplicitIntentExFirst : AppCompatActivity() {
    val id:Int=10
    val msg:String = "kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent_ex_first)

        val btnC = findViewById<Button>(R.id.FirstBtn)
        btnC.setOnClickListener {
            val intent = Intent(this, ExplicitIntentExSecond::class.java)
            intent.putExtra("id_value", id)
            intent.putExtra("msg_value", msg)
            startActivity(intent)
        }
    }
}