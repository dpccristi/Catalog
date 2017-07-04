package com.example.cristinel.catalog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Cristinel on 7/1/2017.
 */

public class RegisterClass extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);

    }


    public void loginButton(View view) {
        Intent intent = new Intent(this,TableLayoutDoi.class);
        startActivity(intent);
    }
}
