package com.example.cse224_kotlin_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import android.widget.Toast

class GridViewBasicExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view_basic_example)

        val gv = findViewById<GridView>(R.id.gridview)
        gv.adapter = ImageAdapter(this)
        gv.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext,"Image Position: $position",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}