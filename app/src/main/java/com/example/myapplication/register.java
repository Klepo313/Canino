package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class register extends AppCompatActivity {

    EditText etIme, etPrezime, etEmail, etLozinka, etPonoviLozinku, etGodine, etSpol, etMjesto, etTelefon;
    Button btnRegistracija;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_register);

        btnRegistracija = (Button)findViewById(R.id.btnRegistracija);
        etIme = (EditText)findViewById(R.id.editTextTextIme);
        etPrezime = (EditText)findViewById(R.id.editTextTextPrezime);
        etEmail = (EditText)findViewById(R.id.editTextTextEmailAddress);
        etLozinka = (EditText)findViewById(R.id.editTextTextPassword);
        etPonoviLozinku = (EditText)findViewById(R.id.editTextTextPasswordAgain);
        etGodine = (EditText)findViewById(R.id.editTextNumberGodine);
        etSpol = (EditText)findViewById(R.id.editTextNumberSpol);
        etMjesto = (EditText)findViewById(R.id.editTextTextLocation);
        etTelefon = (EditText)findViewById(R.id.editTextTextPhone);


        btnRegistracija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register.this, nakonRegistracije.class);
                startActivity(intent);
            }
        });

    }
}