package com.example.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class welcome extends AppCompatActivity implements View.OnClickListener {
    private EditText ReturnName;
    private Button ManageClass;
    private Button Tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ReturnName=findViewById(R.id.et_return);

        Intent intent=getIntent();
        String name=intent.getStringExtra("userName");
        ReturnName.setText("欢迎"+name+"来到你的空间");

        ManageClass=findViewById(R.id.manageClass);
        Tool=findViewById(R.id.tool);
        ManageClass.setOnClickListener(this);
        Tool.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.manageClass:
                Intent intent=new Intent(welcome.this,ListClass.class);
                startActivity(intent);
                break;
        }
    }
}
