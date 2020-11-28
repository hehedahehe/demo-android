package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.example.myapplication.ui.DrawView;

public class CustomViewActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /**
         * 视图的组装放到XML文件中进行
         */
//        //get the layout container
//        LinearLayout root = (LinearLayout) findViewById(R.id.root);
//        // create a DrawView component
//        final DrawView drawView = new DrawView(this);
//        // set the min-with and min-height
//        drawView.setMinimumWidth(300);
//        drawView.setMinimumHeight(500);
//
//        root.addView(drawView);
    }
}
