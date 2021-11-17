package com.example.cse224_kotlin_2021

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.registerForActivityResult

class ImagePickerExample : AppCompatActivity() {
    lateinit var imageUri:Uri
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_picker_example)

        val imageV = findViewById<ImageView>(R.id.imageV)
        val btnSelect = findViewById<Button>(R.id.BtnSelect)
        val btnSend = findViewById<Button>(R.id.button4)

        val getImage = registerForActivityResult(ActivityResultContracts.GetContent(),
            ActivityResultCallback {
                imageUri=it
                imageV.setImageURI(it)
            })

        btnSend.setOnClickListener {
           val intent = Intent(this, ImageReceiverExample::class.java)
            intent.putExtra("img", imageUri)
            startActivity(intent)
        }

        btnSelect.setOnClickListener {
            getImage.launch("image/*")
        }


    }
}