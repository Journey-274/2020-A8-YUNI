package com.example.yuni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_position1.*
import kotlinx.android.synthetic.main.activity_position3.*

class Position3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_position3)
        getSupportActionBar()?.hide();
        position3_b.setOnClickListener {
            val intent = Intent(this,Tieshi::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.enter_0,R.anim.exit_0)
        }
    }
}