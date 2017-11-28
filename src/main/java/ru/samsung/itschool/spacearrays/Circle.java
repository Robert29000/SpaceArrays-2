package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/**
 * Created by student2 on 27.11.17.
 */

public class Circle implements Drawable,Touchable{
  protected   float x,y,r=20;
    Paint p=new Paint();

   public void draw(Canvas canvas){
        canvas.drawCircle(x,y,r,p);
    }

    public Circle(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void OnTouch(MotionEvent event){
        r+=20;
    }
}
