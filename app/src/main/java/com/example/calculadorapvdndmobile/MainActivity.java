package com.example.calculadorapvdndmobile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
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
                    etHD.setFocusable(false);
                }
            }
        });

        etHD.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                erro();

                return false;
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
        etCM.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (CON > 0){

                negativo();

                return true;

                }

                else {

                positivo();
                return true;

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
//                        bBarbarian = true;

                    }
                    else {
                        if (cHD == 0){
                            etBarbarian.setText(String.valueOf(""));
                            iBarbarian = 0;
                            erro0();
                        } else {
                            etBarbarian.setText(String.valueOf(""));
                            iBarbarian = 0;
                            erro();
                        }
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
//                        bBard = true;

                    }
                    else {
                        if (cHD == 0){
                            etBard.setText(String.valueOf(""));
                            iBard = 0;
                            erro0();
                        } else {
                            etBard.setText(String.valueOf(""));
                            iBard = 0;
                            erro();
                        }
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
//                        bCleric = true;

                    }
                    else {
                        if (cHD == 0){
                            etCleric.setText(String.valueOf(""));
                            iCleric = 0;
                            erro0();
                        } else {
                            etCleric.setText(String.valueOf(""));
                            iCleric = 0;
                            erro();
                        }
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
//                      bDruid = true;

                    }
                    else {
                        if (cHD == 0){
                            etDruid.setText(String.valueOf(""));
                            iDruid = 0;
                            erro0();
                        } else {
                            etDruid.setText(String.valueOf(""));
                            iDruid = 0;
                            erro();
                        }
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
//                        bFighter = true;

                    }
                    else {
                        if (cHD == 0){
                            etFighter.setText(String.valueOf(""));
                            iFighter = 0;
                            erro0();
                        } else {
                            etFighter.setText(String.valueOf(""));
                            iFighter = 0;
                            erro();
                        }
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
//                        bMonk = true;

                    }
                    else {
                        if (cHD == 0){
                            etMonk.setText(String.valueOf(""));
                            iMonk = 0;
                            erro0();
                        } else {
                            etMonk.setText(String.valueOf(""));
                            iMonk = 0;
                            erro();
                        }
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
//                        bPaladin = true;

                    }
                    else {
                        if (cHD == 0){
                            etPaladin.setText(String.valueOf(""));
                            iPaladin = 0;
                            erro0();
                        } else {
                            etPaladin.setText(String.valueOf(""));
                            iPaladin = 0;
                            erro();
                        }
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
//                        bRanger = true;

                    }
                    else {
                        if (cHD == 0){
                            etRanger.setText(String.valueOf(""));
                            iRanger = 0;
                            erro0();
                        } else {
                            etRanger.setText(String.valueOf(""));
                            iRanger = 0;
                            erro();
                        }
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
//                        bRogue = true;

                    }
                    else {
                        if (cHD == 0){
                            etRogue.setText(String.valueOf(""));
                            iRogue = 0;
                            erro0();
                        } else {
                            etRogue.setText(String.valueOf(""));
                            iRogue = 0;
                            erro();
                        }
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
//                        bSorcerer= true;

                    }
                    else {
                        if (cHD == 0){
                            etSorcerer.setText(String.valueOf(""));
                            iSorcerer = 0;
                            erro0();
                        } else {
                            etSorcerer.setText(String.valueOf(""));
                            iSorcerer = 0;
                            erro();
                        }
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
//                        bWarlock = true;

                    }
                    else {
                        if (cHD == 0){
                            etWarlock.setText(String.valueOf(""));
                            iWarlock = 0;
                            erro0();
                        } else {
                            etWarlock.setText(String.valueOf(""));
                            iWarlock = 0;
                            erro();
                        }
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
//                        bWizard = true;
                    }
                    else {
                        if (cHD == 0){
                            etWizard.setText(String.valueOf(""));
                            iWizard = 0;
                            erro0();
                        } else {
                            etWizard.setText(String.valueOf(""));
                            iWizard = 0;
                            erro();
                        }
                    }
                }
            }
        });

//Calculate
        btnCalculate = findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
            if (cHD != 0) {

                erro();

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
                    result.setTitle("Average total life: " + vTotal);
                    result.setNeutralButton("ok", null);
                    result.show();
                    }

            };
       });

    }

//  ERRO
    private void erro (){

        AlertDialog.Builder erro = new AlertDialog.Builder(MainActivity.this);
        erro.setTitle("Still " + cHD + " remaining HD");
        erro.setPositiveButton("ok", null);
        erro.show();

    }
//  ERRO 0
    private void erro0 (){

        AlertDialog.Builder erro = new AlertDialog.Builder(MainActivity.this);
        erro.setTitle("No more HD available");
        erro.setPositiveButton("ok", null);
        erro.show();

    }

// CON NEGATIVO
    private int negativo (){
        AlertDialog.Builder negativo = new AlertDialog.Builder(this);
        negativo.setTitle("Negative Atribute?");
        negativo.setNegativeButton("No", null);
        negativo.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                CON = CON * (-1);
                etCM.setTextColor(Color.rgb(255,0,0));
                etCM.setText(String.valueOf(CON));
            }
        });
        negativo.show();
        return CON;


// CON POSITIVO
    }    private int positivo (){
        AlertDialog.Builder positivo = new AlertDialog.Builder(this);
        positivo.setTitle("Positive Atribute?");
        positivo.setNegativeButton("No", null);
        positivo.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                CON = CON * (-1);
                etCM.setTextColor(Color.rgb(0,0,0));
                etCM.setText(String.valueOf(CON));
            }
        });
        positivo.show();
        return CON;

    }

}