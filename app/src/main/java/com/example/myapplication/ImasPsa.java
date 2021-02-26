package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ImasPsa extends AppCompatActivity {

    Animation fromtop, fromright, fromleft;
    RadioGroup radioGroup;
    RadioButton radBtnDa, radBtnNe;
    TextView dopRegTxt, imasPsaTxt, imepsaTxt, paspasminaTxt, godineTxt, onjemuTxt;
    EditText editTextTextImePsa, editTextTextPasmina, editTextNumberStarostPsa, edtInput;
    Button daljeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_imas_psa);

        ////////////////////////////////////////////////////////
        //RadioGroup/Buttons
        radioGroup = (RadioGroup)findViewById(R.id.radgroupDaNe);
        radBtnDa = (RadioButton)findViewById(R.id.radioButtonDa);
        radBtnNe = (RadioButton)findViewById(R.id.radioButtonNe);
        //TextView
        dopRegTxt = (TextView)findViewById(R.id.dopReg);
        imasPsaTxt = (TextView)findViewById(R.id.imasPsaTxt);
        imepsaTxt = (TextView)findViewById(R.id.imepsaTxt);
        paspasminaTxt = (TextView)findViewById(R.id.ime_pasmina);
        godineTxt = (TextView)findViewById(R.id.godineTxt);
        onjemuTxt = (TextView)findViewById(R.id.onjemuTxt);
        //EditText
        editTextTextImePsa = (EditText)findViewById(R.id.editTextTextImePsa);
        editTextTextPasmina = (EditText)findViewById(R.id.editTextTextPasmina);
        editTextNumberStarostPsa = (EditText)findViewById(R.id.editTextNumberStarostPsa);
        edtInput = (EditText)findViewById(R.id.edtInput);
        //Button
        daljeBtn = (Button)findViewById(R.id.daljeBtn);
        //ANIMACIJA
        fromleft = AnimationUtils.loadAnimation(this,R.anim.fromleft);
        fromright = AnimationUtils.loadAnimation(this,R.anim.fromright);
        ///////////////////////////////////////////////////////

        //GONE/VISIBLE
        daljeBtn.setVisibility(View.GONE);
        dopRegTxt.setVisibility(View.VISIBLE); dopRegTxt.setAnimation(fromright);
        imasPsaTxt.setVisibility(View.VISIBLE); imasPsaTxt.setAnimation(fromleft);
        radioGroup.setVisibility(View.VISIBLE); radioGroup.setAnimation(fromright);
        imepsaTxt.setVisibility(View.GONE);
        paspasminaTxt.setVisibility(View.GONE);
        godineTxt.setVisibility(View.GONE);
        onjemuTxt.setVisibility(View.GONE);
        editTextTextImePsa.setVisibility(View.GONE);
        editTextNumberStarostPsa.setVisibility(View.GONE);
        editTextTextPasmina.setVisibility(View.GONE);
        edtInput.setVisibility(View.GONE);

        daljeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImasPsa.this.startActivity(new Intent(ImasPsa.this, glavni_screen.class));
            }
        });


        //PROVJERA CHEKIRANOSTI

        radBtnDa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
                            WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                    rel_btn.leftMargin = 800;
                    rel_btn.topMargin = 3400;
                    rel_btn.height = 250;
                    rel_btn.width = 360;

                    daljeBtn.setLayoutParams(rel_btn);

                    daljeBtn.setVisibility(View.VISIBLE);
                    daljeBtn.setVisibility(View.VISIBLE);
                    imepsaTxt.setVisibility(View.VISIBLE); imepsaTxt.setAnimation(fromleft);
                    paspasminaTxt.setVisibility(View.VISIBLE); paspasminaTxt.setAnimation(fromleft);
                    godineTxt.setVisibility(View.VISIBLE); godineTxt.setAnimation(fromleft);
                    onjemuTxt.setVisibility(View.VISIBLE); onjemuTxt.setAnimation(fromleft);
                    editTextTextImePsa.setVisibility(View.VISIBLE); editTextTextImePsa.setAnimation(fromright);
                    editTextNumberStarostPsa.setVisibility(View.VISIBLE); editTextNumberStarostPsa.setAnimation(fromright);
                    editTextTextPasmina.setVisibility(View.VISIBLE); editTextTextPasmina.setAnimation(fromright);
                    edtInput.setVisibility(View.VISIBLE); edtInput.setAnimation(fromright);
                }
            }

        });

        radBtnNe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    daljeBtn.setVisibility(View.VISIBLE);
                    RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
                            WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                    rel_btn.leftMargin = 900;
                    rel_btn.topMargin = 1000;
                    rel_btn.height = 250;
                    rel_btn.width = 360;

                    daljeBtn.setLayoutParams(rel_btn);
                    dopRegTxt.setVisibility(View.VISIBLE);
                    imasPsaTxt.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);
                    imepsaTxt.setVisibility(View.GONE);
                    paspasminaTxt.setVisibility(View.GONE);
                    godineTxt.setVisibility(View.GONE);
                    onjemuTxt.setVisibility(View.GONE);
                    editTextTextImePsa.setVisibility(View.GONE);
                    editTextNumberStarostPsa.setVisibility(View.GONE);
                    editTextTextPasmina.setVisibility(View.GONE);
                    edtInput.setVisibility(View.GONE);
                }
            }
        });


    }
}