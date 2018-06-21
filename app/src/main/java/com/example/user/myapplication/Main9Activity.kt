package com.example.user.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main9.*

class Main9Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        Text2.text = "Вы благополучно добираетесь до столицы, и там вас сразу же приглашают на бал. " +
                "Там вам предлагают свою помощь, но вам придется выбрать кого взять ко двору."

        Answer91.text = "Дворянин имеющий хорошее отношение со всеми солдатами"

        Answer92.text = "Дворянин в чьей власти вся горнодобывающая промышленность"

        Answer93.text = "Дворянин имеющий на своей территории один из крупнейших торговых городов"

        Answer94.text = "Дворянин иностранец купивший свое положение деньгами и связями"

        Answer95.text = "Вдова богатейшего рода дворян"

    }
}
