package com.ed.medeiros.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private DatePickerDialog.OnDateSetListener mDatePickerDialog;
    private EditText editText;
    String dataPronta;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button   = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int dia = calendar.get(Calendar.DAY_OF_MONTH);
                int mes = calendar.get(Calendar.MONTH);
                int ano = calendar.get(Calendar.YEAR);

                DatePickerDialog dialog = new DatePickerDialog(
                        MainActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDatePickerDialog,
                        ano, mes, dia

                );
                dialog.show();
            }
        });

        mDatePickerDialog = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int ano, int mes, int dia) {
                //Formata a data:
                mes = mes + 1;
                if (dia >= 10 && mes >= 10){
                    dataPronta = dia +"/"+mes+"/"+ano;
                }if (dia < 10 && mes < 10){
                    dataPronta = "0"+dia +"/0"+mes+"/"+ano;
                }if (dia < 10 && mes >= 10){
                    dataPronta = "0"+dia +"/"+mes+"/"+ano;
                }if (dia >= 10 && mes < 10){
                    dataPronta = ""+dia +"/0"+mes+"/"+ano;
                }
                editText.setText(dataPronta);
            }
        };

    }
}