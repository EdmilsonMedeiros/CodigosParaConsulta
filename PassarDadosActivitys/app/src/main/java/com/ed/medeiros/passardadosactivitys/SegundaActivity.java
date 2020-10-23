package com.ed.medeiros.passardadosactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    private TextView textViewOla;
    private String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textViewOla = findViewById(R.id.textViewOla);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getString("key");
            textViewOla.setText("Olá, "+value);
        }


    }
}