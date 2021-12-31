package com.example.my_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StaticRvAdapter staticRvAdapter;
    private Static_RvAdapter1 staticRvAdapter1;

    TextView topdoctor;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topdoctor = findViewById(R.id.top_doctorId);

        topdoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });


        ArrayList<StaticRvModel> item = new ArrayList<>();
        item.add(new StaticRvModel(R.drawable.eye,"eye"));
        item.add(new StaticRvModel(R.drawable.doctor1,"tituklk"));
        item.add(new StaticRvModel(R.drawable.doctor2,"doctor2"));
        item.add(new StaticRvModel(R.drawable.doctor3,"doctor3"));
        item.add(new StaticRvModel(R.drawable.heart,"heart"));

      recyclerView = findViewById(R.id.rv_1);
      staticRvAdapter = new StaticRvAdapter(item);
      recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
      recyclerView.setAdapter(staticRvAdapter);


        ArrayList<Static_RvModel1> item1 = new ArrayList<>();
        item1.add(new Static_RvModel1(R.drawable.eye,"Mitu kumar deb nath","Titu kumar deb nath"));
        item1.add(new Static_RvModel1(R.drawable.doctor1,"doctor1","hk"));
        item1.add(new Static_RvModel1(R.drawable.doctor2,"doctor2","gjgj"));
        item1.add(new Static_RvModel1(R.drawable.doctor3,"doctor3","ugg"));
        item1.add(new Static_RvModel1(R.drawable.heart,"heart","gjgjgj"));

        recyclerView = findViewById(R.id.rv_2);
        staticRvAdapter1 = new Static_RvAdapter1(item1,getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(staticRvAdapter1);



    }
}