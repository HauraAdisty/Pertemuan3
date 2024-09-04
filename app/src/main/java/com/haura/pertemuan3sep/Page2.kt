package com.haura.pertemuan3sep

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Page2 : AppCompatActivity() {
    private lateinit var  Page2 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page2)
        val tvTampil = findViewById<TextView>(R.id.tvTampil)

        val getUSername = intent.getStringExtra("Username")
        val getPassword = intent.getStringExtra("Password")

        tvTampil.setText("hallo ${getUSername}! Password anda adalah ${getPassword}")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}