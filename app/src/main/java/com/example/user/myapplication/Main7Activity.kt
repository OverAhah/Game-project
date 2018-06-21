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



        Answer1.text = "С детства он был в тени старшего брата . Он трудолюбив и готов пойти на все ради власти"
        Answer2.text = "Дочь богатого дворянина без власти ,она красива и умна все детство провела в учебных заведениях за границей ."
        Answer3.text = "младший сын дворянина все детство провел на охоте и часто устраивал дружеские дуэли"
        Answer4.text = "старший сын дворянин все время проводит на охоте и дуэлях"
        Answer5.text = "красивая дочь дворянина любит балы больше интересует любовь нежели власть"

        Answer1.setOnClickListener {
            val intent = Intent(this, Main9Activity::class.java)
            startActivity(intent)
        }

        Answer2.setOnClickListener {
            val intent = Intent(this, Main9Activity::class.java)
            startActivity(intent)
        }

        Answer3.setOnClickListener {
            val intent = Intent(this, Main9Activity::class.java)
            startActivity(intent)
        }

        Answer4.setOnClickListener {
            val intent = Intent(this, Main9Activity::class.java)
            startActivity(intent)
        }

        Answer5.setOnClickListener {
            val intent = Intent(this, Main9Activity::class.java)
            startActivity(intent)
        }


    }
}