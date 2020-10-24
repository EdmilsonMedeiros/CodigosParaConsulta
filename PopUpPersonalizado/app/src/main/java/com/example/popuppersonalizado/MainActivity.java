package com.example.popuppersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDialog = new Dialog(this);

    }
    public void showPopUp(View view){
        TextView    textViewClose;
        Button      button;
        Button      buttonPop;

        myDialog.setContentView(R.layout.popup_personalizado);
        textViewClose = (TextView) myDialog.findViewById(R.id.textViewClose);
        buttonPop = (Button) myDialog.findViewById(R.id.buttonPop);

        textViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}