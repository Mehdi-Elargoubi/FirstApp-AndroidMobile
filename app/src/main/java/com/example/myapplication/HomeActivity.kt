package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // 1- Recuperer login envoyé par l'actìvityMain
        val login = intent.getStringExtra("login")
        val listPosts = findViewById<ListView>(R.id.listPosts)
        //val postsArray = arrayListOf("Post 1","Post 2","Post 3","Post 4")
        val postsArray = arrayListOf(
            Post("Post 1", "Cela une description de post 1", R.drawable.img1),
            Post("Post 2", "Cela une description de post 2", R.drawable.img2),
            Post("Post 3", "Cela une description de post 3", R.drawable.img1),
            Post("Post 4", "Cela une description de post 4", R.drawable.img2)
        )
        val adapter = PostsAdapter(this, R.layout.item_post, postsArray)
        listPosts.adapter = adapter

    }
}