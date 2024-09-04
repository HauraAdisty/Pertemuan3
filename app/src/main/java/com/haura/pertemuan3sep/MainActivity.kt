package com.haura.pertemuan3sep

import android.content.Intent
import android.os.Bundle
import android.provider.Contacts.Intents
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.security.auth.callback.PasswordCallback

class MainActivity : AppCompatActivity() {

    private lateinit var etUsername :EditText
    private lateinit var etPassword :EditText
    private lateinit var btnLogin :Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        etPassword = findViewById(R.id.Password)
        etUsername = findViewById(R.id.Username)
        btnLogin = findViewById(R.id.btnLogin)


        btnLogin.setOnClickListener(){


        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}