package com.example.whenexample

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
// FruitChecker sinfi
class FruitChecker {
    // Har bir meva uchun metodlar
    fun checkApple(): String {
        return "You entered Apple!"
    }
    fun checkBanana(): String {
        return "You entered Banana!"
    }
    fun checkCherry(): String {
        return "You entered Cherry!"
    }
    fun checkUnknown(): String {
        return "Unknown fruit"
    }
    // Kirish ma'lumotini tekshirish
    fun checkFruit(input: String): String {
        return when (input.lowercase()) {
            "apple" -> checkApple()
            "banana" -> checkBanana()
            "cherry" -> checkCherry()
            else -> checkUnknown()
        }
    }
}
// MainActivity sinfi
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // UI elementlarini olish
        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        // FruitChecker obyekti yaratish
        val fruitChecker = FruitChecker()
        // Tugmacha bosilganda
        button.setOnClickListener {
            val input = editText.text.toString()
            // FruitChecker sinfi yordamida natijani olish
            val result = fruitChecker.checkFruit(input)
            // Natijani TextViewga chiqarish
            textView.text = result
        }
    }

    }
