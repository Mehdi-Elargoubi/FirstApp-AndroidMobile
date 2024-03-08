package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val connect = findViewById<Button>(R.id.connecter)
        val login = findViewById<EditText>(R.id.login)
        val password = findViewById<EditText>(R.id.password)
        val error = findViewById<TextView>(R.id.error)

        connect.setOnClickListener {
            //println("Hello, je suis le button connect ${it.id} !")
            //Toast.makeText(this, "Vous avez cliquer sur le button connect", Toast.LENGTH_LONG).show()

            error.visibility = View.GONE
            val textLogin = login.text.toString()
            val textPassword = password.text.toString()
            //Toast.makeText(this, " $textLogin", Toast.LENGTH_LONG).show()

            /*if(textLogin.trim().isEmpty()){
                Toast.makeText(this, "Le champs email ne peut pas etre vide", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, " $textLogin", Toast.LENGTH_LONG).show()
            }
            if(textPassword.trim().isEmpty()){
                Toast.makeText(this, "Le champs Password ne peut pas etre vide", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, " $textPassword", Toast.LENGTH_LONG).show()
            }*/

            if (textLogin.trim().isEmpty() || textPassword.trim().isEmpty() ){
                error.text = "Vous devez remplir tout les champs !"
                error.visibility = View.VISIBLE
                //Toast.makeText(this, "Vous devez remplir tout les champs", Toast.LENGTH_LONG).show()
            }else{
                val correctLogin = "mehdi"
                val correctPassword = "0000"
                if (correctLogin == textLogin && correctPassword == textPassword){
                    //Toast.makeText(this, "Bienvenu a votre application", Toast.LENGTH_LONG).show()
                    // Intent Explicitly
                    login.setText("")
                    password.setText("")
                    Intent(this,HomeActivity::class.java).also {
                        it.putExtra("login",textLogin)
                        startActivity(it)
                    }
                }else{
                    error.text = "Email ou mot de passe n'est pas correct"
                    error.visibility = View.VISIBLE
                    //Toast.makeText(this, "Email ou mot de passe n'est pas correct", Toast.LENGTH_LONG).show()
                }

            }




        }
    }
}