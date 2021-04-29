package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SayHay extends AppCompatActivity {
private Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hay);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Nama_activity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.txtkamu);
        textView.setText(message);

        exit = findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exit();
            }
        });
    }
    private void exit(){
        finish();
    }
}