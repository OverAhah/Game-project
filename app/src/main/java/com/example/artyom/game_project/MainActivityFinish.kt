package com.example.artyom.game_project

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_finish.*

class MainActivityFinish : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_finish)

        Finish1.text = "Спасибо, что играли в нашу игру!!"

        Finish_Name1.text = "Здесь будут наши имена и/или почты"
        Finish_Name2.text = "Здесь будут наши имена и/или почты"
        Finish_Name3.text = "Здесь будут наши имена и/или почты"
        Finish_Name4.text = "Здесь будут наши имена и/или почты"

    }
}
