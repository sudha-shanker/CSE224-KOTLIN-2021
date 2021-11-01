package com.example.cse224_kotlin_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts

class ImagePickerExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_picker_example)

        val imageV = findViewById<ImageView>(R.id.imageV)
        val btnSelect = findViewById<Button>(R.id.BtnSelect)

        val getImage = registerForActivityResult(ActivityResultContracts.GetContent(),
            ActivityResultCallback {
                imageV.setImageURI(it)
            })

        btnSelect.setOnClickListener {
            getImage.launch("image/*")
        }


    }
}