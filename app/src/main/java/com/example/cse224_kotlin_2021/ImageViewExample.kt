package com.example.cse224_kotlin_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageViewExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view_example)

        val monkey = findViewById<ImageView>(R.id.monkey)
        val and = findViewById<ImageView>(R.id.android)

        monkey.setOnClickListener {
            Toast.makeText(applicationContext,"ImageView! Monkey",Toast.LENGTH_LONG).show()
        }

        and.setOnClickListener {
            Toast.makeText(applicationContext,"ImageView! Android",Toast.LENGTH_LONG).show()
        }


    }
}