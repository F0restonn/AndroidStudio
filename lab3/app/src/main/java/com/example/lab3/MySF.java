package com.example.lab3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MySF extends SurfaceView {
    private boolean playing = true;

    private class Anim extends Thread{
        int counter = 0;

        @Override
        public void run(){
            long last_updated_time = 0;
            long delay = 1000;
            int img_ids[]={
                    R.drawable.mask1,
                    R.drawable.mask2,
                    R.drawable.mask3,

            };

            while (true){
                if (playing){
                    // получаем текущее время и вычисляем разницу с предыдущим
                    // сохраненным моментом времени
                    long current_time = System.currentTimeMillis();
                    if (current_time > last_updated_time+delay){
                        if (counter >= 3){
                            counter = 0;

                        }
                        draw(img_ids[counter]);
                        last_updated_time = current_time;
                        counter++;


                    }
                    }
                }
            }
        }

        private  void draw (int img_ids){
            SurfaceHolder holder = getHolder();
            Canvas canvas = holder.lockCanvas();
            if (canvas != null){
                canvas.drawColor(Color.WHITE);
                Paint paint = new Paint();
                // загружаем картинки, которые будем отрисовывать
                Bitmap bitmap = BitmapFactory.decodeResource(getContext().getResources(),
                        img_ids);
                canvas.drawBitmap(bitmap, 100, 100, paint);
                holder.unlockCanvasAndPost(canvas);
            }

        }



    public MySF(Context context) {
        super(context);
        new Anim().start();
    }
}

