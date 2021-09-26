package com.example.cse224_kotlin_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class SpinnerExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner_example)
        val txt2 = findViewById<TextView>(R.id.txt2)

        // access the items of the list
        val languages = arrayOf("Java","Scala","Perl","Python","Android")

        // access the spinner
        val spinner = findViewById<Spinner>(R.id.spinner)

        if (spinner != null) {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, languages)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,view: View, position: Int, id: Long) {
                    Toast.makeText(this@SpinnerExample,
                        "Selected Item" + " " +"" + languages[position],
                        Toast.LENGTH_SHORT).show()
                    var outp:String = languages[position]
                    txt2.text = "Selected: $outp"
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
    }
}