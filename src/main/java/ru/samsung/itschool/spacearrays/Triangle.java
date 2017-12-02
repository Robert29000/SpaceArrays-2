package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;

/**
 * Created by melikyan on 02.12.17.
 */

public class Triangle extends Figure implements Drawable {
    private float x1sp,y1sp,x2,y2,x2sp,y2sp,x3,y3,x3sp,y3sp;
    Triangle(float x,float y){
        super(x,y);
        x1sp=MyDraw.getRandom(x+1,x+200);
        y1sp=MyDraw.getRandom(y+1,y+200);
        x2=x1sp;
        y2=y1sp;
        x2sp=MyDraw.getRandom(x+1,x+200);
        y2sp=MyDraw.getRandom(y+1,y+200);
        x3=x2sp;
        y3=y2sp;
        x3sp=getX();
        y3sp=getY();
    }
    @Override
    public void draw(Canvas canvas) {
        p.setColor(Color.GREEN);
        canvas.drawLine(getX(),getY(),x1sp,y1sp,p);
        canvas.drawLine(x2,y2,x2sp,y2sp,p);
        canvas.drawLine(x3,y3,x3sp,y3sp,p);
    }
}
