package com.example.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class list extends AppCompatActivity {

    private TextView Introduce;
    private List<String> introduce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Introduce = findViewById(R.id.introduce);
        Intent intent = getIntent();

        String name = intent.getStringExtra("data");
        Introduce.setText(name + "\n" + "android可是一门很重要的专业课啊");

    }
}
