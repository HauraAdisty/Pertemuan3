package com.haura.pertemuan3sep

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HalamanUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_halaman_utama)
        val btnPasing = findViewById<Button>(R.id.btnPassingButton)

            val btnhewan = findViewById<Button>(R.id.btnnamahewan)

        val ActButton2 = findViewById<Button>(R.id.btnPassingButton)
        ActButton2.setOnClickListener {
            val Intent = Intent(this, LoginScreen::class.java)
            startActivity(Intent)
        }


        btnhewan.setOnClickListener {
            val Intent = Intent(this, ListViewActivity::class.java)
            startActivity(Intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}