package ru.samsung.itschool.spacearrays;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

public class MyDraw extends View implements View.OnClickListener {

	public MyDraw(Context context, AttributeSet attrs) {
		super(context, attrs);
		//sk=new Sky();
		//sk.makeSky();
		plan=new Planeta();

		objects.add(new Circle(500,888));
		objects.add(new Circle(50,150));
		objects.add(new MyRect(300,300));
		objects.add(new MyRect(750,50));
	}

	//@Override
	//public boolean onTouchEvent(MotionEvent event) {
	//	if(n==99)
	//		n=0;
	//	rocket[n]=new ControllerRocket(event.getX(),event.getY());
	//	n++;
	//	return super.onTouchEvent(event);
	//}
	ArrayList objects=new ArrayList();
	//Sky sk;
	//ControllerRocket[] rocket=new ControllerRocket[100];
	Planeta plan;
	ControllerRocket rocket=new ControllerRocket();
	//int n=0;
	@Override
	protected void onDraw(Canvas canvas) {
		    //sk.drawSky(canvas);
		    plan.drawErth(canvas);
			plan.move();
		    //for(int i=0;i<n;i++){
			//	rocket[i].draw(canvas);
			//	rocket[i].move();
			//}
			for(Object obj:objects){
			if(obj instanceof Drawable){
				((Drawable)obj).draw(canvas);
				}
			}
			rocket.draw(canvas);
			rocket.move();
			invalidate();
	}

	static float getRandom(float a,float b){
		float res=(float)((Math.random()*(b-a)+a));
		return res;
	}

	public boolean onTouchEvent(MotionEvent event){
		rocket.setTarget(event.getX(),event.getY());
		for(Object obj:objects){
			if(obj instanceof Touchable){
				((Touchable)obj).OnTouch(event);
			}
		}
		return super.onTouchEvent(event);
	}

	@Override
	public void onClick(View view) {
		for(Object obj:objects){
			if(obj instanceof OnClickListener){
				((OnClickListener)obj).onClick(view);
			}
		}
	}
}
