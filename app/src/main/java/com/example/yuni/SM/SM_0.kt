package com.example.yuni.SM

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.yuni.R
import kotlinx.android.synthetic.main.activity_s_m_0.*

class SM_0 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_m_0)
        getSupportActionBar()?.hide();
        smb_0.setOnClickListener {
            smt_0.setText("红绿色盲者中的红色盲者只能找到紫色的线，而绿色盲者只能找到红色的线，但红绿色弱者、正常者则两线都找得到。")
        }
        smb_0_s.setOnClickListener {
            Toast.makeText(getApplicationContext(),"已经是第一个了",Toast.LENGTH_SHORT).show()

        }
        smb_0_x.setOnClickListener {
            val intent = Intent(this, SM_1::class.java)
            startActivity(intent)
        }

    }

}
