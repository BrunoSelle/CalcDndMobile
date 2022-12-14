package com.example.calculadorapvdndmobile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnCalculate;
    private ImageButton btnBarbarian, btnBard, btnCleric, btnDruid, btnFigther, btnMonk, btnPaladin, btnRanger, btnRogue, btnSorcerer, btnWarlock, btnWizard;
    private CheckBox cbTough;
    private EditText etCM, etHD;
    private int valor=0, allHD=0, CON=0, vTotal=0, vtough=0, iBarbarian=0, vBarbarian=0, iBard=0, vBard=0, iCleric=0, vCleric=0, iDruid=0, vDruid=0, iFigther=0, vFigther=0, iMonk=0, vMonk=0, iPaladin=0, vPaladin=0, iRanger=0, vRanger=0, iRogue=0, vRogue=0, iSorcerer=0, vSorcerer=0, iWarlock=0, vWarlock=0, iWizard=0, vWizard=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//  Quantidade de HD
        etHD = findViewById(R.id.etHD);
        etHD.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etHD.getText().toString().isEmpty())
                {
                    allHD = Integer.valueOf(etHD.getText().toString());
                }
            }
        });

//  Modificador de CON
        etCM = findViewById(R.id.etCM);
        etCM.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etCM.getText().toString().isEmpty())
                {
                    CON = Integer.valueOf(etCM.getText().toString());
                }
            }
        });

//Tough
        cbTough = findViewById(R.id.cbTF);
        if(cbTough.isChecked()){

            vtough = allHD*2;

        }
        else
        {

            vtough = 0;

        }




//Barbarian
        btnBarbarian = findViewById(R.id.btnBarbarian);
        btnBarbarian.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (allHD >= iBarbarian) {
                        iBarbarian = alerta();
                        allHD = allHD - iBarbarian;
                        vBarbarian = (7 + CON) * iBarbarian;
                    }
                    else {
                        erro();
                    }

                }

            });

//Bard
        btnBard = findViewById(R.id.btnBard);
        btnBard.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (allHD >= iBard) {
                        iBard = alerta();
                        allHD = allHD - iBard;
                        vBard = (5 + CON) * iBard;
                    }
                    else {
                        erro();
                    }
                }

            });


//Cleric
        btnCleric = findViewById(R.id.btnCleric);
        btnCleric.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (allHD >= iCleric) {
                        iCleric = alerta();
                        allHD = allHD - iCleric;
                        vCleric = (5 + CON) * iCleric;
                    }
                    else {
                        erro();
                    }
                }

            });


//Druid
        btnDruid = findViewById(R.id.btnDruid);
        btnDruid.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (allHD >= iDruid) {
                        iDruid = alerta();
                        allHD = allHD - iDruid;
                        vDruid = (5 + CON) * iDruid;
                    }
                    else {
                        erro();
                    }
                }
            });


//Figther
        btnFigther = findViewById(R.id.btnFigther);
        btnFigther.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (allHD >= iFigther) {
                        iFigther = alerta();
                        allHD = allHD - iFigther;
                        vFigther = (6 + CON) * iFigther;
                    }
                    else {
                        erro();
                    }
                }
            });

//Monk
        btnMonk = findViewById(R.id.btnMonk);
        btnMonk.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (allHD >= iMonk) {
                        iMonk = alerta();
                        allHD = allHD - iMonk;
                        vMonk = (5 + CON) * iMonk;
                    }
                    else {
                        erro();
                    }
                }
            });

//Paladin
        btnPaladin = findViewById(R.id.btnPaladin);
        btnPaladin.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (allHD >= iPaladin) {
                        iPaladin = alerta();
                        allHD = allHD - iPaladin;
                        vPaladin = (6 + CON) * iPaladin;
                    }
                    else {
                        erro();
                    }
                }
            });

//Ranger
        btnRanger = findViewById(R.id.btnRanger);
        btnRanger.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (allHD >= iRanger) {
                        iRanger = alerta();
                        allHD = allHD - iRanger;
                        vRanger = (6 + CON) * iRanger;
                    }
                    else {
                        erro();
                    }
                }
            });

//Rogue
        btnRogue = findViewById(R.id.btnRogue);
        btnRogue.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (allHD >= iRogue) {
                        iRogue = alerta();
                        allHD = allHD - iRogue;
                        vRogue = (5 + CON) * iRogue;
                    }
                    else {
                        erro();
                    }
                }

            });

//Sorcerer
        btnSorcerer = findViewById(R.id.btnSorcerer);
        btnSorcerer.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (allHD >= iSorcerer) {
                        iSorcerer = alerta();
                        allHD = allHD - iSorcerer;
                        vSorcerer = (4 + CON) * iSorcerer;
                    }
                    else {
                        erro();
                    }
                }
            });

//Warlock
        btnWarlock = findViewById(R.id.btnWarlock);
        btnWarlock.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (allHD >= iWarlock) {
                        iWarlock = alerta();
                        allHD = allHD - iWarlock;
                        vWarlock = (5 + CON) * iWarlock;
                    }
                    else {
                        erro();
                    }
                }
            });

//Wizard
        btnWizard = findViewById(R.id.btnWizard);
        btnWizard.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (allHD >= iWizard) {
                        iWizard = alerta();
                        allHD = allHD - iWizard;
                        vWizard = (4 + CON) * iWizard;
                    }
                    else {
                        erro();
                    }
                }
            });

//Calculate
        btnCalculate = findViewById(R.id.btnCalculate);

        if (allHD != 0) {

            btnCalculate.setEnabled(false);

        } else {
            btnCalculate.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){


                    vTotal = vBarbarian + vBard + vCleric + vDruid + vFigther + vMonk + vPaladin + vRanger + vRogue + vSorcerer + vWarlock + vWizard + vtough;

                    AlertDialog.Builder result = new AlertDialog.Builder(MainActivity.this);
                    result.setTitle("HD: " + allHD + " \nCON: " + CON + " \nVida média " + vTotal);
                    result.setNeutralButton("ok", null);
                    result.show();
                    }

            });
       }

    }

// ALERTA
    private int alerta (){
        AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
        alerta.setTitle("Quantidade de níveis na classe");
        EditText etNroClasse = new EditText(MainActivity.this);
        etNroClasse.setHint("Numero");
        alerta.setView(etNroClasse);

        alerta.setNeutralButton("Cancelar", null);
        alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                valor = Integer.valueOf(etNroClasse.getText().toString());

            }
        });
        alerta.show();
        return valor;
    }

//  ERRO
    private void erro (){

        AlertDialog.Builder erro = new AlertDialog.Builder(MainActivity.this);
        erro.setTitle("Não há HD para distribuir");
        erro.setPositiveButton("ok", null);
        erro.show();

    }


}