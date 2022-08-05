package com.sebastianrod.whale_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private WhaleAdapter whaleAdapter;
    private ArrayList<WhaleModel> whaleModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.whale_recycle_view);
        whaleAdapter = new WhaleAdapter(whaleModels);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(whaleAdapter);

    }

    private void fetchWhales(){
        RetrofitClient.getRetrofitClient().getWhales().enqueue(new Callback<ArrayList<WhaleModel>>() {
            @Override
            public void onResponse(Call<ArrayList<WhaleModel>> call, Response<ArrayList<WhaleModel>> response) {
                whaleModels = response.body();
            }

            @Override
            public void onFailure(Call<ArrayList<WhaleModel>> call, Throwable t) {

            }
        });
    }



}