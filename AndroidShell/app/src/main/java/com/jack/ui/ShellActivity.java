package com.jack.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.jack.androidshell.R;

public class ShellActivity extends AppCompatActivity {

    private Button button1;
    private ImageView imageView1;
    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shell);

        button1 = findViewById(R.id.button1);
        imageView1 = findViewById(R.id.imageView1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (flag) {
                    flag = false;
                    button1.setText("返回");
                    imageView1.setImageDrawable(getResources().getDrawable(
                            R.drawable.tortoise_shell1));
                } else {
                    flag = true;
                    button1.setText("下一页");
                    imageView1.setImageDrawable(getResources().getDrawable(
                            R.drawable.tortoise_shell));

                }
            }
        });
    }
}
