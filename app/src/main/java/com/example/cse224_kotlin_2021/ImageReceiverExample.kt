package com.example.cse224_kotlin_2021

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageReceiverExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_receiver_example)

        val imageS = findViewById<ImageView>(R.id.imageS)
        val bundle:Bundle? = intent.extras
        val id = bundle?.get("img")

        imageS.setImageURI(id as Uri?)
    }
}