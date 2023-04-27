package com.example.medhi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val login_button = findViewById<Button>(R.id.login_button)

        login_button.setOnClickListener{
            val username = username.text.toString()
            val password = password.text.toString()

            //implement login logic

            Toast.makeText(this, "Logging in...", Toast.LENGTH_SHORT).show()
        }
    }
}