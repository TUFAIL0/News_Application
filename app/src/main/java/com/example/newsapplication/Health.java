package com.example.newsapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Health extends Fragment {

    String api = "b0400680f6fa4a7ab475a4c398a7ce00";

    ArrayList<ModelClass> modelClassArrayList;
    Adapter adapter;
    String country = "in";
    private RecyclerView recyclerviewofhealth;
    private String category = "health";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.healthfragment, null);



        recyclerviewofhealth = v.findViewById(R.id.recyclerViewOfHealth);
        modelClassArrayList = new ArrayList<>();
        recyclerviewofhealth.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(), modelClassArrayList);
        recyclerviewofhealth.setAdapter(adapter);

        findNews();
        return v;



    }

    private void findNews() {


        ApiUtilities.getApiInterface().getCategoryNews(country, category, 100, api).enqueue(new Callback<MainNews>() {
            @Override
            public void onResponse(Call<MainNews> call, Response<MainNews> response) {
                if(response.isSuccessful()) {
                    modelClassArrayList.clear();
                    modelClassArrayList.addAll(response.body().getArticle());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<MainNews> call, Throwable t) {

            }
        });

    }
}