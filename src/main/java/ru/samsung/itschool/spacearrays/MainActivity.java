package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Intent intent=getIntent();
		imageManager.resources=getResources();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button=(Button)findViewById(R.id.magicbutton);
		MyDraw mydraw=(MyDraw)findViewById(R.id.myDraw1);
		button.setOnClickListener(mydraw);
		Button button1=(Button)findViewById(R.id.button2);
		button1.setOnClickListener(mydraw);
		Button rightbutton=(Button)findViewById(R.id.rightbutton);
		rightbutton.setOnClickListener(mydraw);
		Button leftbutton=(Button)findViewById(R.id.leftbotton);
		leftbutton.setOnClickListener(mydraw);
	}





}
