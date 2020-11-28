package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity1 extends AppCompatActivity {

    // 定义一个访问图片的数组
    int[] images = new int[]{
            R.drawable.p1,
            R.drawable.p3,
            R.drawable.p2,
    };

    int currentImg = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //1.设置main_activity为内容视图
        setContentView(R.layout.main);

        //获取LinerLayout布局容器
        LinearLayout main = (LinearLayout) findViewById(R.id.root);

        //create image view
        final ImageView image = new ImageView(this);
        // add image view to main layout
        main.addView(image);
        // show the first image when image view component init
        image.setImageResource(images[0]);
        image.setOnClickListener(
                (view) -> {
                    ++currentImg;
                    int resourceId = images[currentImg % images.length];
                    System.out.println("image:" + currentImg + ", resources id:" + resourceId);
                    image.setImageResource(resourceId);
                });

    }

}