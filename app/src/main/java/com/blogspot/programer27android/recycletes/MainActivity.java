package com.blogspot.programer27android.recycletes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReadWriteLock;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcl;
    ArrayList<String> list;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter radapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=new ArrayList<>();
        rcl= (RecyclerView) findViewById(R.id.recycleViewwwww);
        layoutManager=new LinearLayoutManager(this);
        rcl.setHasFixedSize(true);
        rcl.setLayoutManager(layoutManager);

        list.addAll(Arrays.asList(getResources().getStringArray(R.array.namecountry)));

        radapter=new Radapter(list);
        rcl.setAdapter(radapter);
//        rcl.addOnScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
//                super.onScrollStateChanged(recyclerView, newState);
//            }
//
//            @Override
//            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//                super.onScrolled(recyclerView, dx, dy);
//            }
//        });
    }
}
