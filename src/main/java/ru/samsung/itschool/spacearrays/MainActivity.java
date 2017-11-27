package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		imageManager.resources=getResources();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button=(Button)findViewById(R.id.magicbutton);
		MyDraw mydraw=(MyDraw)findViewById(R.id.myDraw1);
		button.setOnClickListener(mydraw);
	}


	public void Makemagic(View view) {
	}


}
