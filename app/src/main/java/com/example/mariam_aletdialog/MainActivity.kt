package com.example.mariam_aletdialog

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val show = findViewById<Button>(R.id.BtonShow)
        show.setOnClickListener {
            showDialog()
        }
    }
    private fun showDialog() {
        val customDialog = Dialog(this)
        customDialog.setContentView(R.layout.alet)

        customDialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        val GOBottn = customDialog.findViewById(R.id.btG0) as Button
        var tvText =customDialog.findViewById(R.id.textMessage) as TextView
        var etText =customDialog.findViewById(R.id.etText) as TextView
        val TV = customDialog.findViewById(R.id.Tv) as Button

        TV.setOnClickListener {
            tvText.text = etText.text
        }
        GOBottn.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)
            intent.putExtra("text", etText.text.toString())
            startActivity(intent)
            customDialog.dismiss()
        }

        customDialog.show()
    }

}
