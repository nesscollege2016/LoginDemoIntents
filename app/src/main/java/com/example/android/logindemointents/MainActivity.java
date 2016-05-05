package com.example.android.logindemointents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvHelloUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHelloUser = (TextView) findViewById(R.id.tvHelloUser);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");

        tvHelloUser.setText(String.format("Hello, %s", name));
    }
}
