package com.example.yuni.SM

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yuni.R
import kotlinx.android.synthetic.main.activity_s_m_1.*
import kotlinx.android.synthetic.main.activity_s_m_2.*

class SM_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_m_2)
        getSupportActionBar()?.hide();
        smb_2.setOnClickListener {
            smt_2.setText("正常看应是一幅“牛”的图案，如看到的是一头“鹿”，就有可能是色盲或色弱。")
        }
        smb_2_s.setOnClickListener {
            val intent = Intent(this, SM_1::class.java)
            startActivity(intent)
        }
        smb_2_x.setOnClickListener {
            val intent = Intent(this, SM_3::class.java)
            startActivity(intent)
        }
    }
}