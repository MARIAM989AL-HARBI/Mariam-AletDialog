package com.example.mariam_aletdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val   text = intent.getStringExtra("text")
        val tvtext=findViewById<TextView>(R.id.tvTexts)
        tvtext.text=text
    }
}

