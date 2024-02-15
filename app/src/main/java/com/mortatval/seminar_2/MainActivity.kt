package com.mortatval.seminar_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textTopLine: TextView = findViewById(R.id.top_line)
        textTopLine.text = "Это верхняя строчка приложения!"
        val textBottomLine: TextView = findViewById(R.id.bottom_line)
        textBottomLine.text = "Это нижняя строчка приложения!"

    }
}