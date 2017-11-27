package ru.samsung.itschool.spacearrays;

/**
 * Created by student2 on 27.10.17.
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Planeta {
    float cx,cy,x,y,r,degree;
    void move(){
        this.degree+=0.01;
        this.x=(float)(r*Math.cos(degree)+cx);
        this.y=(float)(r*Math.sin(degree)+cy);

    }
    Paint paint=new Paint();
    Matrix matrix = new Matrix();
    static Bitmap pic=imageManager.get(R.drawable.earth);
    void drawErth(Canvas canvas){
        matrix.setScale(0.2f, 0.2f);
        //Study mathematics, dear young programmer :)
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(pic, matrix, paint);
    }

    Planeta(){
        this.r=MyDraw.getRandom(100,200);
        this.cx=MyDraw.getRandom(10,500);
        this.cy=MyDraw.getRandom(10,500);
        this.degree=0;
    }
}
