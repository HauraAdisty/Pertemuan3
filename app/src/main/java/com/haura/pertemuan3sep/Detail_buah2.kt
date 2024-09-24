package com.haura.pertemuan3sep

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detail_buah2 : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_buah2)


    val txtDetail = findViewById<TextView>(R.id.txtDetail)
        val imgDetail = findViewById<ImageView>(R.id.imgDetail)

      val detailText = intent.getStringExtra("deskripsi")
        val imgdetail = intent.getIntExtra("imageResId", 0 )

        txtDetail.setText(detailText)
        imgDetail.setImageResource(imgdetail)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}