package com.example.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etName,etPassword;
    private Button  Login,Out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=findViewById(R.id.et_name);
        etPassword=findViewById(R.id.et_password);
        Login=findViewById(R.id.bt_login);
        Out=findViewById(R.id.bt_out);
        Login.setOnClickListener(this);
        Out.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_login:
                if(etPassword!=null){
                    getInfo();
                }
               break;
        }
    }

    private void getInfo() {
        String userName=etName.getText().toString().trim();
        Intent intent=new Intent(MainActivity.this,welcome.class);
        intent.putExtra("userName",userName);
        startActivity(intent);
    }
}
