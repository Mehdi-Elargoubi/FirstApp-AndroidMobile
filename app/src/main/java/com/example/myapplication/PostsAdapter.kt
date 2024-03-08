package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class PostsAdapter(
    var mcontext: Context,
    var resource: Int,
    var values: ArrayList<Post>
) : ArrayAdapter<Post>(mcontext, resource, values) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val post = values[position]
        val  itemView = LayoutInflater.from(mcontext).inflate(resource, parent, false)
        val tvTitre = itemView.findViewById<TextView>(R.id.tvTitre)
        val description = itemView.findViewById<TextView>(R.id.description)
        val imagePost = itemView.findViewById<ImageView>(R.id.imagePost)

        tvTitre.text = post.titre
        description.text = post.description
        imagePost.setImageResource(post.image)

        return itemView
    }
}