package com.example.user.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main7.*

class Main7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        Plot1.text = "После совета, было принято решения отправить с вами кого-то ещё на ваше усматрение." +
        "Кого вы выберет?"

        GoNext.setOnClickListener {
            val intent = Intent(this, Main8Activity::class.java)
            startActivity(intent)
        }


    }
}