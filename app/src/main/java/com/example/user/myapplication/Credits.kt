package com.example.user.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.act_credits.*
import android.graphics.Typeface


class Credits : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_credits)

        Text.text = "В разработке принимали участие: \n" +
                "\n" +
                "Дмитрий Сукнёв \n" +
                "Артём Козак \n" +
                "Алёна Боброва \n" +
                "Дмитрий Чупров \n"


        val tx = findViewById(R.id.Text) as TextView
        val custom_font = Typeface.createFromAsset(assets, "fonts/mainfont.ttf")
        tx.typeface = custom_font
    }
}