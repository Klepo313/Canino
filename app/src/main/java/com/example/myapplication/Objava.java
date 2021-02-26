package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Objava extends AppCompatActivity {

    Button objaviBtn;
    TextView doTv, odTv, datumaTv, ponistiTxt;
    EditText etIme, etPrezime, etVrijemeOd, etVrijemeDo, etLokacija, etNapomena, etDatum;
    private int mYear, mMonth, mDay, mHour, mMinute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_objava);


        objaviBtn = (Button)findViewById(R.id.btnObjavi);
        ponistiTxt = (TextView)findViewById(R.id.textView15);
        doTv = (TextView)findViewById(R.id.doTV);
        odTv = (TextView)findViewById(R.id.odTV);
        datumaTv = (TextView)findViewById(R.id.datumaTV);
        etIme = (EditText)findViewById(R.id.editTextTextIme);
        etPrezime = (EditText)findViewById(R.id.editTextTextPrezime);
        etVrijemeOd = (EditText)findViewById(R.id.editTextTextVrijeme);
        etVrijemeDo = (EditText)findViewById(R.id.editTextTextVrijeme2);
        etDatum = (EditText)findViewById(R.id.editTextTextDatum);
        etLokacija = (EditText)findViewById(R.id.editTextTextLocation);
        etNapomena = (EditText)findViewById(R.id.editTextNapomena);
/*
        odTv.setOnClickListener((View.OnClickListener) this);
        doTv.setOnClickListener((View.OnClickListener) this);
        datumaTv.setOnClickListener((View.OnClickListener) this);*/

        ponistiTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Objava.this.startActivity(new Intent(Objava.this, glavni_screen.class));
            }
        });

        odTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();
                mHour = c.get(Calendar.HOUR_OF_DAY);
                mMinute = c.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(Objava.this, new TimePickerDialog.OnTimeSetListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        etVrijemeOd.setText(hourOfDay + ":" + minute);
                    }
                }, mHour,mMinute, false );
                timePickerDialog.show();

            }
        });

        doTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();
                mHour = c.get(Calendar.HOUR_OF_DAY);
                mMinute = c.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(Objava.this, new TimePickerDialog.OnTimeSetListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        etVrijemeDo.setText(hourOfDay + ":" + minute);
                    }
                }, mHour,mMinute, false );
                timePickerDialog.show();

            }
        });

        datumaTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar calendar = Calendar.getInstance();
                mYear = calendar.get(Calendar.YEAR);
                mMonth = calendar.get(Calendar.MONTH);
                mDay = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(Objava.this, new DatePickerDialog.OnDateSetListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                        etDatum.setText(dayOfMonth + " - " + (month+1) + " - " + year);

                    }
                }, mYear,mMonth,mDay);
                datePickerDialog.show();

            }
        });




    }

}