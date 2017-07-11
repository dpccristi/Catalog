package com.example.cristinel.catalog.Student;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.example.cristinel.catalog.R;
import com.example.cristinel.catalog.loginregister.Introducere;



public class NotaStudent extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nota_student);
        TextView textView = (TextView) findViewById(R.id.textViewNota);
        textView.setText("das");

    }


}
