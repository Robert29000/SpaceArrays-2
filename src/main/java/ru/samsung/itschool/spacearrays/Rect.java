package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;

/**
 * Created by melikyan on 02.12.17.
 */

public class Rect extends Figure implements Drawable{
    private float height,width;
    Rect(float x,float y){
        super(x,y);
        height=MyDraw.getRandom(100,300);
        width=MyDraw.getRandom(100,880);
    }
    @Override
    public void draw(Canvas canvas) {
        p.setColor(Color.YELLOW);
        canvas.drawRect(150,200,width,height,p);
    }
}
