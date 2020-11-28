package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CodeViewActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //创建一个线性布局器
        LinearLayout layout = new LinearLayout(this);
        //设置该Activity显示layout
        super.setContentView(layout);
        layout.setOrientation(LinearLayout.VERTICAL);
        //创建一个textview
        final TextView show = new TextView(this);
        //创建一个button
        Button bn = new Button(this);
        bn.setText(R.string.ok);
        bn.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                )
        );
        //向layout中添加TextView
        layout.addView(show);
        //向layout容器中添加按钮
        layout.addView(bn);

        //为按钮绑定一个事件监听器
        bn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show.setText("Hello, Android," + new java.util.Date());
                    }
                }
        );

    }
}
