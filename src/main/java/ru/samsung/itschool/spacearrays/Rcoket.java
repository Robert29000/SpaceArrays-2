package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/**
 * Created by student2 on 23.10.17.
 */

public class Rcoket {
    public float x,y;
    public float vx,vy;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setVx(float vx) {
        this.vx = vx;
    }

    public void setVy(float vy) {
        this.vy = vy;
    }

    void move(){
        this.x+=this.vx;
        this.y+=this.vy;
    }
    Paint paint=new Paint();
    Matrix matrix = new Matrix();
    static Bitmap pic=imageManager.get(R.drawable.rocket);
    void draw(Canvas canvas)
    {
        matrix.setScale(0.2f, 0.2f);
        //Study mathematics, dear young programmer :)
        matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(pic, matrix, paint);
    }
    Rcoket(float x,float y ){
        this.x=x;
        this.y=y;
        this.vx=MyDraw.getRandom(-5,5);
        this.vy=MyDraw.getRandom(-5,5);
    }
   // Rcoket(Rcoket rocket){
    //   this.x=rocket.x;
    //    this.y=rocket.y;
    //    this.vx=-rocket.vx;
    //    this.vy=-rocket.vx;
    //}
    Rcoket(){
        this.x=MyDraw.getRandom(0,350);
        this.y=MyDraw.getRandom(0,350);
        this.vx=MyDraw.getRandom(-5,5);
        this.vy=MyDraw.getRandom(-5,5);
    }
}
