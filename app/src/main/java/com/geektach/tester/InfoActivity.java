package com.geektach.tester;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {
    private Music_Adapter adapter;
    ArrayList<Model> arrayList;
    private RecyclerView recyclerView;
    private static final String KEY = "KAY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        loadData();
        
    }

    private void loadData() {
        arrayList = new ArrayList<>();

    }
}