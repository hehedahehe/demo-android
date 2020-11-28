package com.example.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Demo FrameLayout
 */
public class MainActivity3 extends AppCompatActivity {

    private int currentColor = 0;

    /**
     *  <color name="purple_200">#FFBB86FC</color>
     *     <color name="purple_500">#FF6200EE</color>
     *     <color name="purple_700">#FF3700B3</color>
     *     <color name="teal_200">#FF03DAC5</color>
     *     <color name="teal_700">#FF018786</color>
     *     <color name="black">#FF000000</color>
     *     <color name="white">#FFFFFFFF</color>
     */

    final int[] colors = new int[]{
            R.color.purple_200,
            R.color.purple_500,
            R.color.purple_700,
            R.color.teal_200,
            R.color.teal_700,
            R.color.black
    };

    final int[] names = new int[]{
            R.id.textView1,
            R.id.textView2,
            R.id.textView3,
            R.id.textView4,
            R.id.textView5,
            R.id.textView6
    };

    TextView[] views = new TextView[names.length];

    Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            //
            if (msg.what == 0x123) {
                for (int i = 0; i < names.length; i++) {
                    views[i].setBackgroundResource(colors[
                            (i + currentColor) % names.length]);
                }

                currentColor++;
            }
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayoutdemo);

        for (int i = 0; i < names.length; i++) {
            views[i] = (TextView) findViewById(names[i]);
        }
        //定义一个线程周期性地改变currentColor变量值
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        }, 0, 200);


    }




}