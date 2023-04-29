package com.example.myapplicationmeme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme2 : AppCompatActivity() {
    lateinit var button2:Button
    lateinit var button3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        button2=findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        button3=findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent=Intent(this,Meme3::class.java)
            startActivity(intent)
        }
    }
}