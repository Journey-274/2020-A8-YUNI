package com.example.yuni.SM

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yuni.R
import kotlinx.android.synthetic.main.activity_s_m_0.*
import kotlinx.android.synthetic.main.activity_s_m_1.*

class SM_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_m_1)
        getSupportActionBar()?.hide();
        smb_1.setOnClickListener {
            smt_1.setText("红绿色盲者中的红色盲者能读出6，而绿色盲者能读出2，但红绿色弱者及正常者则两个字都能读出来。")
        }
        smb_1_s.setOnClickListener {
            val intent = Intent(this, SM_0::class.java)
            startActivity(intent)
        }
        smb_1_x.setOnClickListener {
            val intent = Intent(this, SM_2::class.java)
            startActivity(intent)
        }
    }
}