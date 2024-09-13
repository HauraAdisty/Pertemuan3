package com.haura.pertemuan3sep

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HalamanUtama : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_halaman_utama)
        //val btnPasing = findViewById<Button>(R.id.btnPassingButton)

            val btnhewan = findViewById<Button>(R.id.btnnamahewan)
        val btnrv = findViewById<Button>(R.id.btnRv)
        val btnbuah =findViewById<Button>(R.id.btnbuah)
        val btnMovie =findViewById<Button>(R.id.btnMovie)

        val ActButton2 = findViewById<Button>(R.id.btnPassingButton)
        ActButton2.setOnClickListener {
            val Intent = Intent(this@HalamanUtama, LoginScreen::class.java)
            startActivity(Intent)
        }

        btnhewan.setOnClickListener {
            val Intent = Intent(this@HalamanUtama, ListViewActivity::class.java)
            startActivity(Intent)
        }

        btnrv.setOnClickListener {
            val Intent = Intent(this@HalamanUtama, RecycleView::class.java)
            startActivity(Intent)
        }
        btnbuah.setOnClickListener {
            val Intent = Intent(this@HalamanUtama, CustumeImageRecycleView::class.java)
            startActivity(Intent)
        }
        btnMovie.setOnClickListener {
            val Intent = Intent(this@HalamanUtama, Recycle_View_Card_Movie::class.java)
            startActivity(Intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}