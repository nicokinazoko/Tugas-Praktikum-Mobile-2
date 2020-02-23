package com.example.tugas_praktikum_mobile_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPahlawan;
    private ArrayList<PahlawanModel> listPahlawan       =   new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPahlawan              =   findViewById(R.id.rv_team_list);
        rvPahlawan.setHasFixedSize(true);
        listPahlawan.addAll(PahlawanData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPahlawan.setLayoutManager(new LinearLayoutManager(this));
        PahlawanAdapter pahlawanAdapter         =   new PahlawanAdapter(this);
        pahlawanAdapter.setPahlawanModels(listPahlawan);
        rvPahlawan.setAdapter(pahlawanAdapter);
    }
}
