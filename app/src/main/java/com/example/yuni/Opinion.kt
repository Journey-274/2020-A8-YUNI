package com.example.yuni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_opinion.*
import kotlinx.android.synthetic.main.activity_us.*

class Opinion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opinion)
        getSupportActionBar()?.hide();
        opinion_b.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.enter_0,R.anim.exit_0)
        }
        pinglun_b.setOnClickListener {
            val intent = Intent(this,pinglun::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
        }
    }
}