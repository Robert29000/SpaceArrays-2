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
		sk=new Sky();
		sk.makeSky();


		objects.add(new Circle(500,888));
		objects.add(new Circle(50,150));
		objects.add(new MyRect(300,300));
		objects.add(new MyRect(750,50));
	}


	ArrayList objects=new ArrayList();
	Sky sk;

	ControllerRocket rocket;

	@Override
	protected void onDraw(Canvas canvas) {

			sk.drawSky(canvas);
			for(Object obj:objects){
			if(obj instanceof Drawable){
				((Drawable)obj).draw(canvas);
				}
			}
			if(n==1) {
				rocket.draw(canvas);
				rocket.move();
			}
			invalidate();
	}

	static float getRandom(float a,float b){
		float res=(float)((Math.random()*(b-a)+a));
		return res;
	}
	private int n=0;
	public boolean onTouchEvent(MotionEvent event){
		rocket=new ControllerRocket(event.getX(),event.getY());
		n=1;
		//for(Object obj:objects){
		//	if(obj instanceof Touchable){
		//		((Touchable)obj).OnTouch(event);
		//	}
		//}
		return super.onTouchEvent(event);
	}

	@Override
	public void onClick(View view) {
		if(n==1) {
			switch (view.getId()) {
				case R.id.magicbutton:
					rocket.setVx(rocket.getVx()+0.2f);
					rocket.setVy(rocket.getVy()+0.2f);
					break;
				case R.id.button2:
					rocket.setVx(rocket.getVx()-0.2f);
					rocket.setVy(rocket.getVy()-0.2f);
					break;
				case R.id.rightbutton:
					rocket.setDegrees(rocket.getDegrees()+0.04f);
					break;
				case R.id.leftbotton:
					rocket.setDegrees(rocket.getDegrees()-0.04f);
					break;
			}
		}
	}
}
