package com.example.homework1exercise3v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView tv = findViewById(R.id.tv_1);
        String stringValue = tv.getText().toString();
        Integer originalValue = Integer.parseInt(stringValue);
        Integer newValue = MyHelper.increaseMyValue(originalValue);
        tv.setText(newValue.toString());
    }
}