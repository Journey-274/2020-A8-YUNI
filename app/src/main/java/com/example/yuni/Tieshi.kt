package com.example.yuni

import android.app.Activity
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_position1.*
import kotlinx.android.synthetic.main.activity_tieshi.*

class Tieshi : AppCompatActivity() {
    //private val data = listOf("什么是色盲？","色盲的种类","色盲图片测试有效果吗？","色盲/色弱能否报考驾照？","色盲/色弱能否矫正？","色盲/色弱对生活的影响大吗？")

    private val tieshiList = ArrayList<TieshiView>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tieshi)
        getSupportActionBar()?.hide();
        tieshi_b.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.enter_0,R.anim.exit_0)
        }
        initTieshiView()   //初始化贴士数据
        val adapter = TieshiViewAdapter(this,R.layout.tieshi_item,tieshiList)
        listview.adapter = adapter
        listview.setOnItemClickListener { parent, view, position, id ->
            val tieshiView = tieshiList[position]
            if(position == 0) {
                //Toast.makeText(this,tieshiView.name,Toast.LENGTH_LONG).show()
                val intent = Intent(this, Position0::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
            }
            else if (position == 1){
                val intent = Intent(this, Position1::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
            }
            else if (position == 2){
                val intent = Intent(this, Position2::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
            }
            else if (position == 3){
                val intent = Intent(this, Position3::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
            }
            else if (position == 4){
                val intent = Intent(this, Position4::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
            }
            else if (position == 5){
                val intent = Intent(this, Position5::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
            }
            else if (position == 6){
                val intent = Intent(this, Position6::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
            }
            else if (position == 7){
                val intent = Intent(this, Position7::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.enter_1,R.anim.exit_1)
            }
        }
    }
    private fun initTieshiView(){
        tieshiList.add(TieshiView("什么是色盲/色弱？",R.drawable.tieshi_2))
        tieshiList.add(TieshiView("色盲/色弱的种类？",R.drawable.tieshi_5))
        tieshiList.add(TieshiView("色盲图片测试有效果吗？",R.drawable.tieshi_6))
        tieshiList.add(TieshiView("色盲/色弱能否报考驾照？",R.drawable.tieshi_8))
        tieshiList.add(TieshiView("色盲/色弱能否矫正？",R.drawable.tieshi_7))
        tieshiList.add(TieshiView("色盲/色弱对生活的影响大吗？",R.drawable.tieshi_0))
        tieshiList.add(TieshiView("色盲/色弱对生活常见的影响。",R.drawable.tieshi_1))
        tieshiList.add(TieshiView("色盲/色弱眼镜是否有效？",R.drawable.tieshi_9))
    }
}
class TieshiView(val name:String,val imageId:Int)

class TieshiViewAdapter(activity:Activity,val resourceId:Int,data:List<TieshiView>):
        ArrayAdapter<TieshiView>(activity,resourceId,data){
    override fun getView(position:Int,convertView:View?,parent:ViewGroup):View{
        val view = LayoutInflater.from(context).inflate(resourceId,parent,false)
        val tieshiImage:ImageView = view.findViewById(R.id.tieshiImage)
        val tieshiName:TextView = view.findViewById(R.id.tieshiName)
        val tieshiView = getItem(position)   //获取当前项的贴士实例
        if(tieshiView!=null){
            tieshiImage.setImageResource(tieshiView.imageId)
            tieshiName.text = tieshiView.name
        }
        return view
    }
}
