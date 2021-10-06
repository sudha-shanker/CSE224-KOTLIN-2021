package com.example.cse224_kotlin_2021

import android.graphics.Color
import android.graphics.Color.CYAN
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import android.graphics.Color.BLACK
import android.widget.TextView
import android.widget.Toast

class SnackBarExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar_example)

        val snack = findViewById<Button>(R.id.btnSnack)
        snack.setOnClickListener {
            val snackBar = Snackbar.make(it,"Thanks for Visiting",Snackbar.LENGTH_LONG)
                .setAction("Action"){
                    Toast.makeText(this,"SnackBar!",Toast.LENGTH_LONG).show()
                }
            snackBar.setActionTextColor(Color.RED)
            snackBar.setTextColor(Color.BLUE)
            snackBar.setBackgroundTint(Color.CYAN)
            snackBar.show()
        }
    }
}