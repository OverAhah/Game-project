package com.example.user.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.act_secondfirstq.*

import android.graphics.Typeface
import android.widget.Button


class SecondFirstQ : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_secondfirstq)


        Text.text = "Вас знакомит вас с генералом, командующим основными военными силами королевства и иностранным послом, помогающим сохранить нестабильные отношения между странами.\n" +
                "Кто из них станет вашим личным советником?"


        answer1.setOnClickListener{
            val intent = Intent(this, Intermediate1::class.java)
            startActivity(intent)
        }

        answer2.setOnClickListener{
            val intent = Intent(this, Intermediate1::class.java)
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