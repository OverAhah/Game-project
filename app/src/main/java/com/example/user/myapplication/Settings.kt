package com.example.user.myapplication

import android.content.Intent
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import kotlinx.android.synthetic.main.act_menu.*
import kotlinx.android.synthetic.main.act_settings.*

class Settings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_settings)

        val tx = findViewById(R.id.textView2) as TextView
        val bt1 = findViewById(R.id.textView) as TextView
        val bt2 = findViewById(R.id.switch1) as Switch
        val custom_font = Typeface.createFromAsset(assets, "fonts/mainfont.ttf")
        tx.typeface = custom_font
        bt1.typeface = custom_font
        bt2.typeface = custom_font
    }
}