package com.example.user.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.act_secondsecondq.*
import android.graphics.Typeface
import android.widget.Button


class SecondSecondQ : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_secondsecondq)


        Text.text = "Вам представляют двух дворян, имеющих большое влияние в столице. Это молодой граф, недавно открывший несколько крупных мануфактур, и старый герцог, богатства которого с каждым годом растут благодаря рабскому труду крестьян в его владениях.\n" +
                "Кто из них станет вашим личным советником?"


        answer1.setOnClickListener{
            Stats.change_libe(20)
            val intent = Intent(this, Intermediate1::class.java)
            startActivity(intent)
        }

        answer2.setOnClickListener{
            Stats.change_cons(20)
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