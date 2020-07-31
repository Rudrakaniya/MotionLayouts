package com.example.motionlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecycleViewActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    ProductRecycleViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        mRecyclerView = findViewById(R.id.recycleview);

        mAdapter = new ProductRecycleViewAdapter();

        String[] array = new String[]{
                "Jammu",
                "Punjab",
                "Jalandhar",
                "Mars",
                "Earth",
                "Jammu",
                "Punjab",
                "Jalandhar",
                "Mars",
                "Earth",
                "Jammu",
                "Punjab",
                "Jalandhar",
                "Mars",
                "Earth",
                "Jammu",
                "Punjab",
                "Jalandhar",
                "Mars",
                "Earth",
                "Jammu",
                "Punjab",
                "Jalandhar",
                "Mars",
                "Earth",
                "Jammu",
                "Punjab",
                "Jalandhar",
                "Mars",
                "Earth"
        };
        mAdapter.setStringArray(array);
        setUpRecycleView();

    }

    private void setUpRecycleView() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
    }
}