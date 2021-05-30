package com.example.myaccount

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class nextPage : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var etPassword : EditText
    lateinit var btnLog : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_page)
        castViews()
        click()

    }

    fun castViews(){
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnLog = findViewById(R.id.btnLog)
    }

    fun click(){
       btnLog.setOnClickListener {
           var email = etEmail.text. toString()
           var password = etPassword.text.toString()
           var intent = Intent(baseContext,signUpPage::class.java)
           startActivity(intent)
       }
    }
}