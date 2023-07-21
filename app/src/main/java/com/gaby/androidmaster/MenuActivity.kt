package com.gaby.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.gaby.androidmaster.firstapp.FirstAppActivity
import com.gaby.androidmaster.imccalculator.IMCcalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludapp = findViewById<Button>(R.id.btnSaludapp)
        val btnImcApp = findViewById<Button>(R.id.btnImcApp)
        btnSaludapp.setOnClickListener { navigateToSaludapp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }


    }

    private fun navigateToImcApp() {
        val intent = Intent(this, IMCcalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludapp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

}
