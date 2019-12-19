package com.jack.androidshell.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this,
                        SecondActivity.class);

                startActivity(mIntent);
                finish();
                // 进场动画、出场动画
//				overridePendingTransition(R.anim.righttoleft_in,
//						R.anim.righttoleft_exit);
//
                overridePendingTransition(R.anim.lefttoright_in,
                        R.anim.lefttoright_exit);

            }
        });
    }
}
