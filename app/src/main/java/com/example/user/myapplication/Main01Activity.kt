package com.example.user.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main01.*

class Main01Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main01)

        Text41.text = "Вы прибыли ко двору, где вас встречает король-отец, он решает что вы должны остаться в столице до его кончины. Вам выделяют личный особняк возле столицы."

       Text41.setOnClickListener {
           val intent = Intent(this, Main10Activity::class.java)
           startActivity(intent)
       }

    }

}
