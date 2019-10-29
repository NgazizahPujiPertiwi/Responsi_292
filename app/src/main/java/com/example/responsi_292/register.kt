package com.example.responsi_292

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        var intent = intent
        val Username = intent.getStringExtra("Username")
        val Password = intent.getStringExtra("Password")
        var Email = intent.getStringExtra("Email")

        val hasil = findViewById<TextView>(R.id.btn_register)
        btn_register.text = "Username : "+Username+"\nPassword: "+Password+"\nEmail: "+Email

        val ket = findViewById<TextView>(R.id.btn_register)

    }
}
