package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Nama_activity extends AppCompatActivity {
public static final String EXTRA_MESSAGE = "com.example.monitory";
private Button selanjutnya;
private EditText edtNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama_activity);

        edtNama = findViewById(R.id.edtNama);
        selanjutnya = findViewById(R.id.btn_selanjutnya);
        selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nama_activity.this,SayHay.class);
                EditText editText = (EditText) findViewById(R.id.edtNama);
                String message = editText.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });


     }

}