package com.example.skill4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.mvp_simmspon_01.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info", "Valor información");
        Log.d("Debug", "Valor Debug");
        Log.w("Warning", "Valor Warning");
        Log.e("Error", "Valor Error");
        Log.v("Verbose", "Valor Verbose");
    }
}