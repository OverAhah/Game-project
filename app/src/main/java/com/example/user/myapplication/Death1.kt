package com.example.user.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main5.*

class Death1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        Text1.text = "К сожалению, вы умерли по пути в столицу." +
                "Чтож, повезет в другой раз"

        Restart1.setOnClickListener {
            val intent = Intent(this, Start::class.java)
            startActivity(intent)
        }
    }
}
