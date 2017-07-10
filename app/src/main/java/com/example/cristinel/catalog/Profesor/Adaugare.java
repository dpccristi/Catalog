package com.example.cristinel.catalog.Profesor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.cristinel.catalog.R;


public class Adaugare extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adaugare);

    }

    public void salvareButton(View view) {
        Intent intent = new Intent(this,TableLayoutDoi.class);
        startActivity(intent);
    }
}
