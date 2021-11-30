package com.example.cse224_kotlin_2021

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu

class PopupMenuExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_menu_example)

        val btn = findViewById<Button>(R.id.btnShow)

        btn.setOnClickListener {
            val popup = PopupMenu(this,btn)
            popup.menuInflater.inflate(R.menu.popupmenu, popup.menu)

            popup.setOnMenuItemClickListener {
                Toast.makeText(applicationContext,
                    "You Clicked : " + it.title, Toast.LENGTH_LONG)
                    .show()
                true
            }
            popup.show()
        }
    }
}