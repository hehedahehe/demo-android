package com.example.myapplication.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawView extends View {
    public float currentX = 40;
    public float currentY = 50;

    Paint p = new Paint();

    public DrawView(Context context) {
        super(context);
    }

    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //设置画笔的颜色
        p.setColor(Color.RED);
        //绘制一个小圆
        canvas.drawCircle(currentX, currentY, 15, p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //修改currentX currentY
        currentX = event.getX();
        currentY = event.getY();

        //tell the current components repaint itself
        invalidate();
        //return true means that this method has deal with this event
        return true;
    }


}
