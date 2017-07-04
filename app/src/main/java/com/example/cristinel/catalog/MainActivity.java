package com.example.cristinel.catalog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      Button buton = (Button) findViewById(R.id.buton);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegisterClass.class);
                startActivity(intent);

            }
        });
        Button buton2 = (Button) findViewById(R.id.butonFacebook);
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TableLayoutDoi.class);
                startActivity(intent);
            }
        });
       }


    public void loginButtonClicked(View view) {
        Intent intent = new Intent(this,TableLayoutDoi.class);
        startActivity(intent);
    }
}
