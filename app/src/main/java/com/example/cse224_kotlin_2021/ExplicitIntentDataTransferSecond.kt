package com.example.cse224_kotlin_2021

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ExplicitIntentDataTransferSecond : AppCompatActivity() {
    lateinit var sendResultButton: Button
    lateinit var resultEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent_data_transfer_second)

        sendResultButton = findViewById(R.id.sendResultButton)
        resultEditText = findViewById(R.id.resultEditText)

        sendResultButton.setOnClickListener {
            setActivityResult()
            finish()
        }

    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_CANCELED)
        super.onBackPressed()

    }

    private fun setActivityResult() {
        val intent = Intent()
        var out:String = resultEditText.text.toString()
        var outp:String = "The result text is : $out"
        intent.putExtra("result", outp)
       // intent.putExtra("result", getString(R.string.the_result_string, resultEditText.text))
        setResult(Activity.RESULT_OK, intent)

    }
}