package ru.samsung.itschool.spacearrays;

import android.app.RemoteInput;
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
import java.util.Objects;

public class MyDraw extends View implements View.OnClickListener {

	public MyDraw(Context context, AttributeSet attrs) {
		super(context, attrs);
		sk=new Sky();
		sk.makeSky();
		objects.add(new Circle(100,300));
		objects.add(new Rect(200,500));
		objects.add(new Triangle(40,70));
	}


	Sky sk;
	ArrayList objects=new ArrayList();
	ControllerRocket rocket;
	Rcoket[] manyrocket=new Rcoket[100];
	@Override
	protected void onDraw(Canvas canvas) {
			sk.drawSky(canvas);
		for (Object i : objects) {
			if (i instanceof Drawable) {
				((Drawable) i).draw(canvas);
			}
		}
			for(int i=0;i <t;i++){
				manyrocket[i].draw(canvas);
				manyrocket[i].move();
			}
			if(n!=0) {
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
		if(n==0) {
			rocket = new ControllerRocket(event.getX(), event.getY());
			n = 1;
			return super.onTouchEvent(event);
		}else {
			rocket.setTarget(event.getX(),event.getY());

		return true;}
	}
	int t=0;
	@Override
	public void onClick(View view) {
		if(view.getId()==R.id.magicbutton){
			manyrocket[t]=new Rcoket(getRandom(10,1000),getRandom(10,1000));
			t++;
		}
		else if(view.getId()==R.id.button2){
			for(Object i:objects){
				if(i instanceof Touchable)
					((Touchable)i).OnTouch();
			}
		}
		if(n==1) {
			switch (view.getId()) {
				case R.id.rightbutton:
					rocket.setVx(rocket.getVx()+0.5f);
					rocket.setVy(rocket.getVy()+0.5f);
					break;
				case R.id.leftbotton:
					rocket.setVx(rocket.getVx()-0.5f);
					rocket.setVy(rocket.getVy()-0.5f);
					break;
			}
		}
	}
}
