package com.example.exe033;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button2);
    }

    public void go(View view) {
        num++;
        btn.setText("this is click number:"+ num);
        if (num==6){
            btn.setText("enought to click. go to new start!");
            num = 0;
        }
    }
}