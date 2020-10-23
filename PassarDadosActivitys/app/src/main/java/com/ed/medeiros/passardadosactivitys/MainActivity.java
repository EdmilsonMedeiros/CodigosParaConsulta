package com.ed.medeiros.passardadosactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextTextPersonName;
    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);


    }
    public void pegarEEnviarDados(View view){
        nome = editTextTextPersonName.getText().toString();
        Intent i = new Intent(this, SegundaActivity.class);
        i.putExtra("key", nome);
        startActivity(i);
    }
}