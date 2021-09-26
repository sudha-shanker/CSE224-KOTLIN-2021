package com.example.cse224_kotlin_2021

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class RadioButtonExample : AppCompatActivity() {
    lateinit var radioButton: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button_example)
        val Rgrp = findViewById<RadioGroup>(R.id.RGrp)
        val BtnSubmit = findViewById<Button>(R.id.BtnSubmit)
        val BtnReset = findViewById<Button>(R.id.BtnReset)
        val txtView = findViewById<TextView>(R.id.txtView)

        BtnSubmit.setOnClickListener {
            val selectId:Int = Rgrp.checkedRadioButtonId
            radioButton = findViewById(selectId)
            var out:String = radioButton.text.toString()
            txtView.text = "Selected: $out "


        }
        BtnReset.setOnClickListener {
            Toast.makeText(applicationContext,"hello",Toast.LENGTH_SHORT).show()
            Rgrp.setOnCheckedChangeListener(null);
            Rgrp.clearCheck();
            txtView.text = " "
            Rgrp.setOnCheckedChangeListener(
                RadioGroup.OnCheckedChangeListener { group, checkedId ->
                    val radio: RadioButton = findViewById(checkedId)
                    Toast.makeText(
                        applicationContext, " On checked change : ${radio.text}",
                        Toast.LENGTH_SHORT
                    ).show()
                    // radio.setTextColor(Color.parseColor("#fe9c02"))
                }
            )


        }

        Rgrp.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(
                    applicationContext, " On checked change : ${radio.text}",
                    Toast.LENGTH_SHORT
                ).show()
               // radio.setTextColor(Color.parseColor("#fe9c02"))
            }
        )


    }
}