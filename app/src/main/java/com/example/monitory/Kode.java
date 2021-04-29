package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kode extends AppCompatActivity {
private Button Masuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode);

        //26-04-2021,10118055,Reza Pratama, IF2

        Masuk = findViewById(R.id.masuk);
        Masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Kode.this, Nama_activity.class));
            }
        });

    }
}