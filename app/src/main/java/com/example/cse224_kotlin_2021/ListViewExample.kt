package com.example.cse224_kotlin_2021

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class ListViewExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_example)

        val lv = findViewById<ListView>(R.id.lv1)
        val ll = findViewById<LinearLayout>(R.id.ll)
     /*  var b = arrayOf("Apple", "Banana", "Carrot", "Grapes")
        var ab = ArrayAdapter(this, android.R.layout.simple_list_item_1, b)
        lv.adapter = ab
        lv.setOnItemClickListener { adapterView, view, position, id ->
            val str = adapterView.getItemAtPosition(position) as String
            Toast.makeText(this, "you selected $str", Toast.LENGTH_SHORT)
                .show()
        }*/


//OR  this is to change the background color of app from the item selected in listview
        val a = arrayOf(Color.RED, Color.BLUE, Color.YELLOW, Color.WHITE)
        val b = arrayOf("RED", "BLUE", "YELLOW", "WHITE")
        val ab = ArrayAdapter(this, android.R.layout.simple_list_item_1, b)
        lv.setAdapter(ab)
        lv.setOnItemClickListener { adapterView, view, position, id ->
            ll.setBackgroundColor(a[position])
        }

    }
}