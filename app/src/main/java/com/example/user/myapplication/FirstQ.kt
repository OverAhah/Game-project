package com.example.user.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.act_firstq.*
import android.graphics.Typeface
import android.widget.Button


class FirstQ : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_firstq)

        Text.text = "Вы являетесь сыном короля и дворянки из бедного рода. Ваша жизнь тихая и размеренная. Ваш дядя заменил вам отца.\n" +
                "Однажды вам приходить известие о тяжёлой болезни короля. Он пожелал чтобы после его смерти новым королем стали Вы.\n" +
                "Что вы будете делать?"


        answer1.setOnClickListener{
            val intent = Intent(this, SecondFirstQ::class.java)
            startActivity(intent)
        }

        answer2.setOnClickListener{
            val intent = Intent(this, SecondSecondQ::class.java)
            startActivity(intent)
        }

        val tx = findViewById(R.id.Text) as TextView
        val bt1 = findViewById(R.id.answer1) as Button
        val bt2 = findViewById(R.id.answer2) as Button
        val custom_font = Typeface.createFromAsset(assets, "fonts/mainfont.ttf")
        tx.typeface = custom_font
        bt1.typeface = custom_font
        bt2.typeface = custom_font
    }
}