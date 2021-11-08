package com.example.cse224_kotlin_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class DynamicViewExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_view_example)

        var ll = findViewById<LinearLayout>(R.id.linearLayout)
        var b1 = findViewById<Button>(R.id.b1)

        b1.setOnClickListener {
            var b2:Button = Button(this)
            b2.text = "New Button"

            b2.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT)

            var pf:TextView = TextView(this)
            pf.text = "New Button Added!"

            pf.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)

            b2.setOnClickListener {
                Toast.makeText(applicationContext,"New Button Added!",Toast.LENGTH_LONG).show()
            }
            ll.addView(b2)
            ll.addView(pf)
        }


    }
}