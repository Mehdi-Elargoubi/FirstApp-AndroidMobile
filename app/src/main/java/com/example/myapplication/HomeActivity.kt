package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // 1- Recuperer login envoyé par l'actìvityMain
        val login = intent.getStringExtra("login")
        val listPosts = findViewById<ListView>(R.id.listPosts)
        val postsArray = listOf("Post 1","Post 2","Post 3","Post 4")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, postsArray)
        listPosts.adapter = adapter

    }
}