package com.example.whenexample

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 获取 UI 组件
        val editTextWord = findViewById<EditText>(R.id.editTextWord)
        val buttonSearch = findViewById<Button>(R.id.buttonSearch)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        // 使用数组存储单词及其定义
        val words = arrayOf("hello", "software", "android", "java")
        val definitions = arrayOf(
            "A greeting.",
            "A program developed for a computer or phone.",
            "A mobile operating system.",
            "A programming language."
        )

        // 按钮点击事件
        buttonSearch.setOnClickListener {
            val input = editTextWord.text.toString().trim().lowercase()

            // 查找单词
            val index = words.indexOf(input)
            val result = if (index != -1) definitions[index] else "Word not found!"

            // 追加新结果，并换行显示
            textViewResult.text = "${textViewResult.text}\n$input: $result"
        }
    }
}
