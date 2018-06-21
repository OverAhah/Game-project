package com.example.user.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.act_inter1.*
import android.graphics.Typeface
import android.widget.Button


class Intermediate1 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_inter1)


        Text.text = "Мероприятие прошло успешно и вы вернулись в поместье."


        next.setOnClickListener{
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        val tx = findViewById(R.id.Text) as TextView
        val next = findViewById(R.id.next) as Button
        val custom_font = Typeface.createFromAsset(assets, "fonts/mainfont.ttf")
        tx.typeface = custom_font
        next.typeface = custom_font

    }
}