package com.haura.pertemuan3sep

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity : AppCompatActivity() {
    private lateinit var Lv_hewan :ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_list_view)
        Lv_hewan = findViewById(R.id.Lv_hewan)
        val namahewan = listOf("Gajah","Beruang","Panda","Kucing")
        Lv_hewan.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,namahewan)

        // untuk bisa di ketik klik setiap item dari list nya
        Lv_hewan.setOnItemClickListener() { parent, view, position, id ->
            Toast.makeText(
                this, "Anda memilih: ${namahewan[position]}",
                Toast.LENGTH_SHORT
            ).show()

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}