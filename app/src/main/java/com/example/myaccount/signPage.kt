package com.example.myaccount

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class signPage : AppCompatActivity() {
    lateinit var etFirstName : EditText
    lateinit var etSecondName : EditText
    lateinit var etEnterEmail : EditText
    lateinit var etNewPassword : EditText
    lateinit var etConfirmPassword : EditText
    lateinit var btnSign : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_page)
        castView()
        click()
    }
    fun castView(){
        etFirstName = findViewById(R.id.etFirstName)
        etSecondName = findViewById(R.id.etSecondName)
        etEnterEmail = findViewById(R.id.etEnterEmail)
        etNewPassword = findViewById(R.id.etNewPassword)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)
        btnSign = findViewById(R.id.btnSign)
    }
    fun click(){
        btnSign.setOnClickListener {
            var firstName = etFirstName.text.toString()
            var secondName = etSecondName.text.toString()
            var email = etEnterEmail.text.toString()
            var password = etNewPassword.text.toString()
            var confirmPassword = etConfirmPassword.text.toString()
            var intent = Intent(baseContext,signUpPage::class.java)
            startActivity(intent)
        }
    }
}