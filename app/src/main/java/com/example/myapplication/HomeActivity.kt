package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvHello = findViewById<TextView>(R.id.tvHello)

        // 1- Recuperer login envoyé par l'actìvityMain
        val login = intent.getStringExtra("login")

        //2- Afficher login dans tvHello
        tvHello.text = "Bienvenu : $login"


    }
}