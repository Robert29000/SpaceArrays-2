package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;

/**
 * Created by melikyan on 02.12.17.
 */

public class Circle extends Figure implements Drawable ,Touchable{
    private float radius,cx,cy,degree;
    Circle(float x,float y){
        super(x,y);
        radius=MyDraw.getRandom(10,200);
        cx=x-10;
        cy=y-10;
        degree=0;
    }
    @Override
    public void draw(Canvas canvas) {
        p.setColor(Color.RED);
        if(t==1){
            degree+=0.01;
            setX((float)(radius*Math.cos(degree)+cx));
            setY((float)(radius*Math.sin(degree)+cy));
        }
        canvas.drawCircle(getX(),getY(),radius,p);
    }
    int t=0;
    @Override
    public void OnTouch() {
        t=1;
    }


}
