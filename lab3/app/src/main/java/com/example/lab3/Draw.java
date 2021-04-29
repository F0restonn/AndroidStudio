package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

class Draw extends View {


    private Paint mPaint = new Paint();

    public Draw(Context context) {
        super(context);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.BLACK);
        mPaint.setAntiAlias(true);
        // овал по всему экрану
        RectF oval1 = new RectF(50, 50, getWidth(), getHeight());
        canvas.drawOval(oval1, mPaint);

        // овал в виде круга (одинаковые размеры высоты и ширины)
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.GREEN);
        RectF oval2 = new RectF(25, 25, 100, 100);
        canvas.drawOval(oval2, mPaint);

        // маленький синий овал
        mPaint.setColor(Color.BLUE);
        RectF oval3 = new RectF(130, 25, 100, 250);
        canvas.drawOval(oval3, mPaint);
    }

}