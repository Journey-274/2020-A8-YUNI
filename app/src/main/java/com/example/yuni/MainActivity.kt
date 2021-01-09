package com.example.yuni

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide();
        semang_test.setOnClickListener {
            val intent = Intent(this,Semang_test::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
        }
        picture_test.setOnClickListener {
            val intent = Intent(this,Picture_test::class.java)
                startActivity(intent)
            overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
    }
        opinion.setOnClickListener {
            val intent = Intent(this,Opinion::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
        }
        tieshi.setOnClickListener {
            val intent = Intent(this,Tieshi::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
        }
        us.setOnClickListener {
            val intent = Intent(this,Us::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
        }
    }
}