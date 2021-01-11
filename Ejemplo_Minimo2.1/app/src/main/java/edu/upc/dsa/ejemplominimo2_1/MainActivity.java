package edu.upc.dsa.ejemplominimo2_1;

import edu.upc.dsa.ejemplominimo2_1.models.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
{
    ProgressBar progressBar;
    APIInterface apiInterface;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);
        apiInterface = APIClient.getClient().create(APIInterface.class);
        recyclerView = (RecyclerView) findViewById(R.id.MuseumRecycler);

        Call<Museums> museumsCall = apiInterface.getMuseums();
        museumsCall.enqueue(new Callback<Museums>()
        {
            @Override
            public void onResponse(Call<Museums> call, Response<Museums> response) {
                Museums museums = response.body();
                progressBar.setVisibility(View.GONE);
                setMuseumView(museums);
                recyclerView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onFailure(Call<Museums> call, Throwable t) {
            }
        });
    }

    public void setMuseumView(Museums museums) {
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        List<Element> input = museums.getElements();
        mAdapter = new RecyclerAdapter(input);
        recyclerView.setAdapter(mAdapter);
    }
}