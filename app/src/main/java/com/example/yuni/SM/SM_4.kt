package com.example.yuni.SM

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yuni.MainActivity
import com.example.yuni.R
import kotlinx.android.synthetic.main.activity_s_m_3.*
import kotlinx.android.synthetic.main.activity_s_m_4.*

class SM_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_m_4)
        getSupportActionBar()?.hide();
        smb_4.setOnClickListener {
            smt_4.setText("红绿色盲者及红绿色弱者大多能读成5，但全色弱者及正常者则大多都读不出来。")
        }
        smb_4_s.setOnClickListener {
            val intent = Intent(this, SM_3::class.java)
            startActivity(intent)
        }
        smb_4_x.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}