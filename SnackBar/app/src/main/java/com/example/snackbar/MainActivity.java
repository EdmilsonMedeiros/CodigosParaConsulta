package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout    mainLayout;
    private Button              button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout  = findViewById(R.id.mainLayout);
        button      = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSnackBar();
            }
        });


    }

    public void openSnackBar(){
        Snackbar.make(mainLayout, "Olá, eu sou um SnackBar!", Snackbar.LENGTH_LONG)
                .setTextColor(getResources().getColor(R.color.red))
                .show();
    }

}