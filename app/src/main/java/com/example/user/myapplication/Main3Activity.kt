package com.example.user.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        Text.text = "Вы являетесь сыном короля и дворянки из бедного рода. Ваша жизнь тихая и размеренная. Ваш дядя заменил вам отца и уже выбрал вам в партию прекрасную дворянку.\n" +
                "Однажды вам приходить известие о смерти короля и, что он перед смертью пожелал чтобы вы стали новым королем ,а не ваш брат от другой матери.\n" +
                "Что вы будете делать?"


        Answers.setOnClickListener{
            val intent = Intent(this, Main4Activity::class.java)
            startActivity(intent)
        }

        Menu31.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val count = 15
    }
}