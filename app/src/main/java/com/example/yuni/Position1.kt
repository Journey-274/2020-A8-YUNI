package com.example.yuni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_position1.*
import kotlinx.android.synthetic.main.activity_us.*

class Position1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_position1)
        getSupportActionBar()?.hide();
        position1_b.setOnClickListener {
            val intent = Intent(this,Tieshi::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.enter_0,R.anim.exit_0)
        }
    }
}