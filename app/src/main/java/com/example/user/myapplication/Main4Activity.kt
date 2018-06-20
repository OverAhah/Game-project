package com.example.user.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        Answer1.text = "Отправиться во дворец (сразу, никому не говоря)"

        Answer2.text = "Собрать группу дворян, чтобы обсудить этот вопрос"

        Answer3.text = "Послать дядю с заявлением, что вы скончались"

        Answer1.setOnClickListener {
            val intent = Intent(this, Main5Activity::class.java)
            startActivity(intent)
        }

        //Answer2.setOnClickListener {
        //    val intent = Intent(this, Main6Activity::class.java)
        //    startActivity(intent)
        //}

        //Answer3.setOnClickListener {
        //    val intent = Intent(this, Main7Activity::class.java)
        //    startActivity(intent)
        //}
    }
}