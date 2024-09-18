package com.haura.pertemuan3sep

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_page)

        val imageResId = intent.getIntExtra("imageResId", 0)
        val title = intent.getStringExtra("title")

        val imageResId2 = intent.getIntExtra("imageResId", 0)
        val  judul = intent.getStringExtra("title")

        val imageView = findViewById<ImageView>(R.id.imageViewDetail)
        val textViewTitle = findViewById<TextView>(R.id.textViewTitle)


        val imageView2 = findViewById<ImageView>(R.id.imageViewDetail)
        val textViewTitle2 = findViewById<TextView>(R.id.textViewTitle)

        imageView.setImageResource(imageResId)
        textViewTitle.text = title ?: "No Title"

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}