package ru.samsung.itschool.spacearrays;

import android.graphics.Paint;

/**
 * Created by melikyan on 02.12.17.
 */

public abstract class Figure {
    private float x,y;
    Paint p=new Paint();
    Figure(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
}
