package com.gaby.androidmaster.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.gaby.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)

        val BtnOne = findViewById<AppCompatButton>(R.id.buttonOne)
        val etOne = findViewById<AppCompatEditText>(R.id.etOne)

        BtnOne.setOnClickListener {
            val name = etOne.text.toString()
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("EXTRA_NAME",name)
            startActivity(intent)
        }


    }
}