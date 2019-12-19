package com.jack.androidshell.app;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

	Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		button1 = findViewById(R.id.button1);

		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent mIntent = new Intent(SecondActivity.this,
						MainActivity.class);

				startActivity(mIntent);

				finish();
//				overridePendingTransition(R.anim.lefttoright_in,
//						R.anim.lefttoright_exit);
//				
				overridePendingTransition(R.anim.righttoleft_in,
						R.anim.righttoleft_exit);

			}
		});
	}

}
