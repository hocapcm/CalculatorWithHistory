package com.example.calculatorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {
    TextView tvHistory;

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        tvHistory = (TextView) findViewById(R.id.tvHistory);
        Intent intent = getIntent();
        String[] mangHistory = intent.getStringArrayExtra("dataHistory");
        for (int i = 0; i < mangHistory.length; i++) {
            tvHistory.append(mangHistory[i]+"\n");
        }


    }
}