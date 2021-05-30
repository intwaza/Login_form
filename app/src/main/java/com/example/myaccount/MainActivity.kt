package com.example.myaccount

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin:Button
    lateinit var btnSignUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        Click()
    }
    fun castViews() {
        btnLogin = findViewById<Button>(R.id.btnLogin)
        btnSignUp = findViewById(R.id.btnSignUp)
    }

    fun Click(){
        btnLogin.setOnClickListener {
            var intent=Intent(baseContext,nextPage::class.java)
            startActivity(intent)

        }
        btnSignUp.setOnClickListener {
            var intent = Intent(baseContext,signPage::class.java)
            startActivity(intent)
        }
    }
}