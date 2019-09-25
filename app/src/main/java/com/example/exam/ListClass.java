package com.example.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListClass extends AppCompatActivity {
    private ListView listClass;
    private List<String> datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_class);

        //加入数据到你的listview里面
        initData();
        listClass=findViewById(R.id.list_class);
        final ArrayAdapter<String > adapter =new ArrayAdapter<>(this
                ,android.R.layout.simple_list_item_1
                ,datas);
        listClass.setAdapter(adapter);
        listClass.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data= (String) parent.getItemAtPosition(position);
                Toast.makeText(ListClass.this,"你点击了"+data,Toast.LENGTH_LONG).show();
                Intent intent=new Intent(ListClass.this,list.class);
                intent.putExtra("data",data);
                startActivity(intent);

            }
        });
    }


    private void initData() {
        datas=new ArrayList<>();
        datas.add("Android应用程序开发");
        datas.add("移动应用程序测试");
        datas.add("高等数学");
        datas.add("高职英语");
        datas.add("java程序设计语言");
        datas.add("Android游戏开发");
        datas.add("心理健康");
        datas.add("体育");

    }
}
