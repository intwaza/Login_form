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
    lateinit var etEmail:EditText
    lateinit var etPassword:EditText
    lateinit var btnLogin:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        Click()
    }
    fun castViews() {
        etEmail = findViewById<EditText>(R.id.etEmailLbl)
        etPassword = findViewById<EditText>(R.id.etPasswordLbl)
        btnLogin = findViewById<Button>(R.id.btnLogin)
    }

    fun Click(){
        btnLogin.setOnClickListener {
            var email= etEmail.text.toString()
            var password = etPassword.text.toString()
            var intent=Intent(baseContext,nextPage::class.java)
            startActivity(intent)

        }
    }
}