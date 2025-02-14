package com.example.whenexample

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            val input = editText.text.toString()
            val result = when (input) {
                "apple" -> "You entered APPle!"
                "banana" -> "You entered Banana"
                "cherry" -> "You entered Cherry"
                else -> "Unknown fruit"
            }
            textView.text = result
        }
    }
    }
