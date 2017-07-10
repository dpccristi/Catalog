package com.example.cristinel.catalog.Profesor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

import com.example.cristinel.catalog.CautareStergere;
import com.example.cristinel.catalog.Profesor.Adaugare;
import com.example.cristinel.catalog.R;
import com.example.cristinel.catalog.Student.Editare;

/**
 * Created by Cristinel on 7/2/2017.
 */

public class TableLayoutDoi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout_doi);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public void adaugareButton(View view) {
        Intent intent = new Intent(this,Adaugare.class);
        startActivity(intent);
    }

    public void cautareButton(View view) {
        Intent intent = new Intent(this,CautareStergere.class);
        startActivity(intent);
    }

    public void stergereButton(View view) {
        Intent intent = new Intent(this,CautareStergere.class);
        startActivity(intent);
    }

    public void editareButton(View view) {
        Intent intent = new Intent(this,Editare.class);
        startActivity(intent);
    }
}
