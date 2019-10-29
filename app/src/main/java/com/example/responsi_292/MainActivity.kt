package com.example.responsi_292

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kedua.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_register.setOnClickListener {
            val Username = findViewById<EditText>(R.id.user)
            val Password = findViewById<EditText>(R.id.password)

            val button = findViewById<Button>(R.id.btn_register)

                .setOnClickListener {
                    var Username = Username.text.toString()
                    var Password = Password.text.toString()

                    intent = Intent(this@MainActivity, register::class.java)
                    intent.putExtra("Username", Username)
                    intent.putExtra("Password", Password)

                    if (Username.equals("tiwi")&&password.equals("123")){
                        Toast.makeText(getApplicationContext(),"Username dan Password benar Anda berhasil Login",
                            Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Username dan Pssword tidak sesuai ",
                            Toast.LENGTH_SHORT).show();
                    }

                    startActivity(intent)
                }
        }
    }
}
