package com.example.yuni.SM

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yuni.R
import kotlinx.android.synthetic.main.activity_s_m_2.*
import kotlinx.android.synthetic.main.activity_s_m_3.*

class SM_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_m_3)
        getSupportActionBar()?.hide();
        smb_3.setOnClickListener {
            smt_3.setText("正常者能读出6，红绿色盲者及红绿色弱者读成5，而全色弱者则全然读不出上述的两个字。")
        }
        smb_3_s.setOnClickListener {
            val intent = Intent(this, SM_2::class.java)
            startActivity(intent)
        }
        smb_3_x.setOnClickListener {
            val intent = Intent(this, SM_4::class.java)
            startActivity(intent)
        }
    }
}