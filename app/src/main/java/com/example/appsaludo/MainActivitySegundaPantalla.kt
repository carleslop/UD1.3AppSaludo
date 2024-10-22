package com.example.appsaludo

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivitySegundaPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_segunda_pantalla)
        val tvGreeting: TextView = findViewById(R.id.tvGreeting)
        val name:String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvGreeting.text = "Hola $name"

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.second_fl)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}