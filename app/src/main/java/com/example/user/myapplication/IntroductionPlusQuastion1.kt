package com.example.user.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.KeyEvent
import kotlinx.android.synthetic.main.activity_main3.*

class IntroductionPlusQuastion1 : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        Text11111.text = "Вы являетесь сыном короля и дворянки из бедного рода. Ваша жизнь тихая и размеренная. Ваш дядя заменил вам отца и уже выбрал вам в партию прекрасную дворянку.\n" +
                "Однажды вам приходить известие о смерти короля и, что он перед смертью пожелал чтобы вы стали новым королем, а не ваш брат от другой матери.\n" +
                "Что вы будете делать?"


        Name1.setOnKeyListener { _, keyCode, event ->
            if(event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER)
                Speaker.text = Name1.text
                true
        }

        Answer1.text = "Отправиться во дворец (сразу, никому не говоря)"

        Answer3.text = "Собрать группу дворян, чтобы обсудить этот вопрос"

        Answer2.text = "Послать дядю с заявлением, что вы скончались"

        Answer1.setOnClickListener {
            val intent = Intent(this, Main9Activity::class.java)
            startActivity(intent)
        }

        Answer2.setOnClickListener {
            val intent = Intent(this, GoodEnd::class.java)
            startActivity(intent)
        }

        Answer3.setOnClickListener {
            val intent = Intent(this, Question2::class.java)
            startActivity(intent)
        }

    }
}

