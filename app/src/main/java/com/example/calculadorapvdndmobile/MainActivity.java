package com.example.calculadorapvdndmobile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button btnCalculate;
    private ImageButton btnBarbarian, btnBard, btnCleric, btnDruid, btnFigther, btnMonk, btnPaladin, btnRanger, btnRogue, btnSorcerer, btnWarlock, btnWizard;
    private boolean tough, bBarbarian, bBard, bCleric, bDruid, bFigther, bMonk, bPaladin, bRanger, bRogue, bSorcerer, bWarlock, bWizard;
    protected int CON, iBarbarian, iBard, iCleric, iDruid, iFigther, iMonk, iPaladin, iRanger, iRogue, iSorcerer, iWarlock, iWizard;
    private int allHD;
    private EditText etCM, etHD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//  Quantidade de HD
        etHD = findViewById(R.id.etHD);
        etHD.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etHD.getText().toString().isEmpty()){
                    allHD = Integer.valueOf(etHD.getText().toString());
                }
            }
        });

//  Modificador de CON
        etCM = findViewById(R.id.etCM);
        etCM.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etCM.getText().toString().isEmpty()){
                    CON = Integer.valueOf(etCM.getText().toString());
                }
            }
        });


    //Barbarian
        btnBarbarian = findViewById(R.id.btnBarbarian);
        btnBarbarian.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {

                bBarbarian = true;

            if (allHD >= iBarbarian){
            iBarbarian = alerta();
            allHD = allHD - iBarbarian;
            }

            }
        });

    //Bard
        Button button = findViewById(R.id.btnBard);
        button.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
            bBard = true;

                if (allHD >= iBard){
                    iBard = alerta();
                    allHD = allHD - iBard;
                }
            }

        });

    //Cleric
        Button button = findViewById(R.id.btnCleric);
        button.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
            bCleric = true;

                if (allHD >= iCleric){
                    iCleric = alerta();
                    allHD = allHD - iCleric;
                }
            }

        });

    //Druid
        Button button = findViewById(R.id.btnDruid);
        button.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
            bDruid = true;

            if (allHD >= iDruid){
                iDruid = alerta();
                allHD = allHD - iDruid;
            }

            }
        });

    //Figther
        Button button = findViewById(R.id.btnFigther);
        button.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
            bFigther = true;

                if (allHD >= iFigther){
                    iFigther = alerta();
                    allHD = allHD - iFigther;
                }

            }
        });

    //Monk
        Button button = findViewById(R.id.btnMonk);
        button.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
            bMonk = true;

                if (allHD >= iMonk){
                    iMonk = alerta();
                    allHD = allHD - iMonk;
                }

            }
        });

    //Paladin
        Button button = findViewById(R.id.btnPaladin);
        button.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
            bPaladin = true;

                if (allHD >= iPaladin){
                    iPaladin = alerta();
                    allHD = allHD - iPaladin;
                }

            }
        });

    //Ranger
        Button button = findViewById(R.id.btnRanger);
        button.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
            bRanger = true;

                if (allHD >= iRanger){
                    iRanger = alerta();
                    allHD = allHD - iRanger;
                }

            }
        });

    //Rogue
        Button button = findViewById(R.id.btnRogue);
        button.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
            bRogue = true;

                if (allHD >= iRogue){
                    iRogue = alerta();
                    allHD = allHD - iRogue;
                }
            }

        });

    //Sorcerer
        Button button = findViewById(R.id.btnSorcerer);
        button.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
            bSorcerer = true;

                if (allHD >= iSorcerer){
                    iSorcerer = alerta();
                    allHD = allHD - iSorcerer;
                }

            }
        });

    //Warlock
        Button button = findViewById(R.id.btnWarlock);
        button.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
            bWarlock = true;

                if (allHD >= iWarlock){
                    iWarlock = alerta();
                    allHD = allHD - iWarlock;
                }

            }
        });

    //Wizard
        Button button = findViewById(R.id.btnWizard);
        button.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
            bWizard = true;

                if (allHD >= iWizard){
                    iWizard = alerta();
                    allHD = allHD - iWizard;
            }

            }
        });
    }

    private int alerta (){
        int valor = 0;
        AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
        alerta.setIcon(android.R.drawable.ic_input_add);
        alerta.setTitle("Quantidade de níveis na classe");
        EditText etNroClasse = new EditText(MainActivity.this);
//É possivel usar os atributos de montagem de tela via código
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


}