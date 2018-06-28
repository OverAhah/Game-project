package com.example.user.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.act_start.*

class Start : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_start)

        WorkingDataBase(this).getQuestion(2)

        backgroundday2.setOnClickListener {
           val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }


    }
}
