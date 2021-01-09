package com.example.yuni;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.FileNotFoundException;

public class P_test extends AppCompatActivity {
    ImageView iv_photo;
    Bitmap bitmap;
    Button p_test_b;
    //一维数组保存20个矩阵值
    float[] mColorMatrix = new float[20];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_test);
        ActionBar actionBar = getSupportActionBar();//消除APP该Activity界面标题栏
        if(actionBar!=null){ //消除APP该Activity界面标题栏
            actionBar.hide(); //消除APP该Activity界面标题栏
        } //消除APP该Activity界面标题栏
        iv_photo = (ImageView) findViewById(R.id.imageView1);
        p_test_b = findViewById(R.id.p_test_b);
        p_test_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(P_test.this,Picture_test.class);
                startActivity(intent);
            }
        });
    }
    public void btn_hongseruo(View view){
            initMatrix_hong();
            setImageMatrix();
    }
    public void btn_lvseruo(View view){
        initMatrix_lv();
        setImageMatrix();
    }
    public void btn_lanseruo(View view){
        initMatrix_lan();
        setImageMatrix();
    }
    public void btn_back(View view){
        initMatrix();
        setImageMatrix();
    }

    public void click(View view) {
// 调用系统的图库
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("image/*");
        startActivityForResult(intent, 0);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
// TODO 自动生成的方法存根
        if (data != null) {
            Uri uri = data.getData();// 获取图片的路径
            iv_photo.setImageURI(uri);
            Log.e("uri", uri.toString());
            //使用content的接口
            ContentResolver cr = this.getContentResolver();
            try {
                //获取图片
                bitmap = BitmapFactory.decodeStream(cr.openInputStream(uri));
                iv_photo.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                Log.e("Exception", e.getMessage(),e);
            }
        }else{
            //操作错误或没有选择图片
            Log.i("MainActivtiy", "operation error");
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
    //初始化颜色矩阵-------红色弱
    private void initMatrix_hong() {
        for (int i = 0; i < 20; i++) {
            if (i % 6 == 0) {
                mColorMatrix[i] = 1;
            }
            else if(i == 4){
                mColorMatrix[i] = 50;
            }
            else {
                mColorMatrix[i] = 0;
            }
        }
    }
    private void initMatrix() {
        for (int i = 0; i < 20; i++) {
            if (i % 6 == 0) {
                mColorMatrix[i] = 1;
            }
            else {
                mColorMatrix[i] = 0;
            }
        }
    }
    private void initMatrix_lv() {
        for (int i = 0; i < 20; i++) {
            if (i % 6 == 0) {
                mColorMatrix[i] = 1;
            }
            else if(i == 9){
                mColorMatrix[i] = 50;
            }
            else {
                mColorMatrix[i] = 0;
            }
        }
    }
    private void initMatrix_lan() {
        for (int i = 0; i < 20; i++) {
            if (i % 6 == 0) {
                mColorMatrix[i] = 1;
            }
            else if(i == 14){
                mColorMatrix[i] = 50;
            }
            else {
                mColorMatrix[i] = 0;
            }
        }
    }


    //将矩阵设置到图像
    private void setImageMatrix() {
        Bitmap bmp = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.set(mColorMatrix);//将一维数组设置到ColorMatrix
        Canvas canvas = new Canvas(bmp);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0, 0, paint);
        iv_photo.setImageBitmap(bmp);
    }
}