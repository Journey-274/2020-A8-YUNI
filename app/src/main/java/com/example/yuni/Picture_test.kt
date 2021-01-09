package com.example.yuni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_picture_test.*
import kotlinx.android.synthetic.main.activity_position0.*

class Picture_test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_test)
        getSupportActionBar()?.hide();
        xz_tp.setOnClickListener {
            val intent = Intent(this,P_test::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
        }
        ps_tp.setOnClickListener {
            val intent = Intent(this,Camera::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
        }
        picture_test_b.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.enter_0,R.anim.exit_0)
        }
    }
}