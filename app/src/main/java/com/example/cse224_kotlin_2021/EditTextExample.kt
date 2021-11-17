package com.example.cse224_kotlin_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class EditTextExample : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text_example)

            val name = findViewById<EditText>(R.id.txtName)
            val password = findViewById<EditText>(R.id.txtPwd)
            val email = findViewById<EditText>(R.id.txtEmai)
            val dob = findViewById<EditText>(R.id.txtDate)
            val phoneno = findViewById<EditText>(R.id.txtPhone)
            val btnSubmit = findViewById<Button>(R.id.btnSend)
            val result = findViewById<TextView>(R.id.resultView)

            btnSubmit.setOnClickListener {
                if(name.text.toString().isEmpty() || password.text.toString().isEmpty() ||
                    email.text.toString().isEmpty() || dob.text.toString().isEmpty()
                    || phoneno.text.toString().isEmpty())

                        result.text = "Please fill all the details"
                else {

                    result.text =
                                  """Name - ${name.text}
                                     Password - ${password.text}
                                     E-Mail - ${email.text}
                                     DOB - ${dob.text}
                                     Contact - ${phoneno.text}"""

                }
            }
   }
}