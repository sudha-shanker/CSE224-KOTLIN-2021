package com.example.cse224_kotlin_2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import javax.sql.StatementEvent

class PermissionExample : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission_example)

        var btnCam = findViewById<Button>(R.id.btnCam)

        val requestCamera = registerForActivityResult(ActivityResultContracts.RequestPermission())
        {
            if(it)
            {
                Toast.makeText(applicationContext,"Permission Granted",Toast.LENGTH_LONG).show()
                setActivityResult()
                finish()
            }
            else
            {
                Toast.makeText(applicationContext,"Permission Denied",Toast.LENGTH_LONG).show()
            }
        }
        btnCam.setOnClickListener {
            requestCamera.launch(android.Manifest.permission.CAMERA)
        }

    }
    private fun setActivityResult() {
        val camera_intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(camera_intent)
    }
}
