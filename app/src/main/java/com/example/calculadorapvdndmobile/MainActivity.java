package com.example.calculadorapvdndmobile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnCalculate;
    private TextView tvBarbarian, tvBard, tvCleric, tvDruid, tvFighter, tvMonk, tvPaladin, tvRanger, tvRogue, tvSorcerer, tvWarlock, tvWizard;
    private CheckBox cbTough;
    private EditText etCM, etHD, etBarbarian, etBard, etCleric, etDruid, etFighter, etMonk, etPaladin, etRanger, etRogue, etSorcerer, etWarlock, etWizard;;
//  private boolean bBarbarian, bBard, bCleric, bDruid, bFighter, bMonk, bPaladin, bRanger, bRogue, bSorcerer, bWarlock, bWizard;
    private int valor=0, allHD=0, cHD=0, CON=0, vTotal=0, vtough=0, iBarbarian=0, vBarbarian=0, iBard=0, vBard=0, iCleric=0, vCleric=0, iDruid=0, vDruid=0, iFighter =0, vFighter =0, iMonk=0, vMonk=0, iPaladin=0, vPaladin=0, iRanger=0, vRanger=0, iRogue=0, vRogue=0, iSorcerer=0, vSorcerer=0, iWarlock=0, vWarlock=0, iWizard=0, vWizard=0;


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
                    cHD = allHD;
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


//Barbarian
        etBarbarian = findViewById(R.id.etBarbarian);
        tvBarbarian = findViewById(R.id.tvBarbarian);
        etBarbarian.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etBarbarian.getText().toString().isEmpty())
                {
                    iBarbarian = Integer.valueOf(etBarbarian.getText().toString());

                    if (cHD >= iBarbarian) {
                        cHD = cHD - iBarbarian;
                        tvBarbarian.setText(String.valueOf(iBarbarian));
                    }
                    else {
                        erro();
                        iBarbarian = 0;
                    }
                }
            }
        });

//Bard
        etBard = findViewById(R.id.etBard);
        tvBard = findViewById(R.id.tvBard);
        etBard.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etBard.getText().toString().isEmpty())
                {
                    iBard = Integer.valueOf(etBard.getText().toString());

                    if (cHD >= iBard) {
                        cHD = cHD - iBard;
                        tvBard.setText(String.valueOf(iBard));
                    }
                    else {
                        erro();
                        iBard = 0;
                    }
                }
            }
        });

//Cleric
        etCleric = findViewById(R.id.etCleric);
        tvCleric = findViewById(R.id.tvCleric);
        etCleric.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etCleric.getText().toString().isEmpty())
                {
                    iCleric = Integer.valueOf(etCleric.getText().toString());

                    if (cHD >= iCleric) {
                        cHD = cHD - iCleric;
                        tvCleric.setText(String.valueOf(iCleric));
                    }
                    else {
                        erro();
                        iCleric = 0;
                    }
                }
            }
        });

//Druid
        etDruid = findViewById(R.id.etDruid);
        tvDruid = findViewById(R.id.tvDruid);
        etDruid.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etDruid.getText().toString().isEmpty())
                {
                    iDruid = Integer.valueOf(etDruid.getText().toString());

                    if (cHD >= iDruid) {
                        cHD = cHD - iDruid;
                        tvDruid.setText(String.valueOf(iDruid));
                    }
                    else {
                        erro();
                        iDruid = 0;
                    }
                }
            }
        });

//Fighter
        etFighter = findViewById(R.id.etFighter);
        tvFighter = findViewById(R.id.tvFighter);
        etFighter.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etFighter.getText().toString().isEmpty())
                {
                    iFighter = Integer.valueOf(etFighter.getText().toString());

                    if (cHD >= iFighter) {
                        cHD = cHD - iFighter;
                        tvFighter.setText(String.valueOf(iFighter));
                    }
                    else {
                        erro();
                        iFighter = 0;
                    }
                }
            }
        });

//Monk
        etMonk = findViewById(R.id.etMonk);
        tvMonk = findViewById(R.id.tvMonk);
        etMonk.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etMonk.getText().toString().isEmpty())
                {
                    iMonk = Integer.valueOf(etMonk.getText().toString());

                    if (cHD >= iMonk) {
                        cHD = cHD - iMonk;
                        tvMonk.setText(String.valueOf(iMonk));
                    }
                    else {
                        erro();
                        iMonk = 0;
                    }
                }
            }
        });

//Paladin
        etPaladin = findViewById(R.id.etPaladin);
        tvPaladin = findViewById(R.id.tvPaladin);
        etPaladin.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etPaladin.getText().toString().isEmpty())
                {
                    iPaladin = Integer.valueOf(etPaladin.getText().toString());

                    if (cHD >= iPaladin) {
                        cHD = cHD - iPaladin;
                        tvPaladin.setText(String.valueOf(iPaladin));
                    }
                    else {
                        erro();
                        iPaladin = 0;
                    }
                }
            }
        });

//Ranger
        etRanger = findViewById(R.id.etRanger);
        tvRanger = findViewById(R.id.tvRanger);
        etRanger.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etRanger.getText().toString().isEmpty())
                {
                    iRanger = Integer.valueOf(etRanger.getText().toString());

                    if (cHD >= iRanger) {
                        cHD = cHD - iRanger;
                        tvRanger.setText(String.valueOf(iRanger));
                    }
                    else {
                        erro();
                        iRanger = 0;
                    }
                }
            }
        });

//Rogue
        etRogue = findViewById(R.id.etRogue);
        tvRogue = findViewById(R.id.tvRogue);
        etRogue.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etRogue.getText().toString().isEmpty())
                {
                    iRogue = Integer.valueOf(etRogue.getText().toString());

                    if (cHD >= iRogue) {
                        cHD = cHD - iRogue;
                        tvRogue.setText(String.valueOf(iRogue));
                    }
                    else {
                        erro();
                        iRogue = 0;
                    }
                }
            }
        });

//Sorcerer
        etSorcerer = findViewById(R.id.etSorcerer);
        tvSorcerer = findViewById(R.id.tvSorcerer);
        etSorcerer.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etSorcerer.getText().toString().isEmpty())
                {
                    iSorcerer = Integer.valueOf(etSorcerer.getText().toString());

                    if (cHD >= iSorcerer) {
                        cHD = cHD - iSorcerer;
                        tvSorcerer.setText(String.valueOf(iSorcerer));
                    }
                    else {
                        erro();
                        iSorcerer = 0;
                    }
                }
            }
        });

//Warlock
        etWarlock = findViewById(R.id.etWarlock);
        tvWarlock = findViewById(R.id.tvWarlock);
        etWarlock.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etWarlock.getText().toString().isEmpty())
                {
                    iWarlock = Integer.valueOf(etWarlock.getText().toString());

                    if (cHD >= iWarlock) {
                        cHD = cHD - iWarlock;
                        tvWarlock.setText(String.valueOf(iWarlock));
                    }
                    else {
                        erro();
                        iWarlock = 0;
                    }
                }
            }
        });

//Wizard
        etWizard = findViewById(R.id.etWizard);
        tvWizard = findViewById(R.id.tvWizard);
        etWizard.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!etWizard.getText().toString().isEmpty())
                {
                    iWizard = Integer.valueOf(etWizard.getText().toString());

                    if (cHD >= iWizard) {
                        cHD = cHD - iWizard;
                        tvWizard.setText(String.valueOf(iWizard));
                    }
                    else {
                        erro();
                        iWizard = 0;
                    }
                }
            }
        });

//Calculate
        btnCalculate = findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
            if (cHD != 0) {

                AlertDialog.Builder dvs = new AlertDialog.Builder(MainActivity.this);
                dvs.setTitle("Ainda há DV's nao informados");
                dvs.setNeutralButton("ok", null);
                dvs.show();

        } else {

                vBarbarian =    (7 + CON) * iBarbarian;
                vBard =         (5 + CON) * iBard;
                vCleric =       (5 + CON) * iCleric;
                vDruid =        (5 + CON) * iDruid;
                vFighter =      (6 + CON) * iFighter;
                vMonk =         (5 + CON) * iMonk;
                vPaladin =      (6 + CON) * iPaladin;
                vRanger =       (6 + CON) * iRanger;
                vRogue =        (5 + CON) * iRogue;
                vSorcerer =     (4 + CON) * iSorcerer;
                vWarlock =      (5 + CON) * iWarlock;
                vWizard =       (4 + CON) * iWizard;

                cbTough = findViewById(R.id.cbTF);
                    if(cbTough.isChecked()){
                    vtough = allHD*2;
                    }
                    else vtough = 0;

                    vTotal = vBarbarian + vBard + vCleric + vDruid + vFighter + vMonk + vPaladin + vRanger + vRogue + vSorcerer + vWarlock + vWizard + vtough;

                    AlertDialog.Builder result = new AlertDialog.Builder(MainActivity.this);
                    result.setTitle("Vida média " + vTotal);
                    result.setNeutralButton("ok", null);
                    result.show();
                    }

            };
       });

    }

//  ERRO
    private void erro (){

        AlertDialog.Builder erro = new AlertDialog.Builder(MainActivity.this);
        erro.setTitle("Não há HD para distribuir");
        erro.setPositiveButton("ok", null);
        erro.show();

    }


}