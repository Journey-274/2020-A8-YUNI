package com.example.yuni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yuni.SM.SM_0
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_position1.*
import kotlinx.android.synthetic.main.activity_semang_test.*

class Semang_test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semang_test)
        getSupportActionBar()?.hide();
        kaishi.setOnClickListener {
            val intent = Intent(this,SM_0::class.java)
            startActivity(intent)
        }
        semang_test_b.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.enter_0,R.anim.exit_0)
        }
    }
}