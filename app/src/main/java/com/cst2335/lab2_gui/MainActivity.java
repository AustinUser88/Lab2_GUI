package com.cst2335.lab2_gui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Switch sC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);

        Button bC = findViewById(R.id.button2);
        sC = (Switch) findViewById(R.id.switch1);
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.Toast_message, Toast.LENGTH_LONG).show();
            }
        });

        sC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Snackbar sn;
                if(isChecked){
                    sn = Snackbar.make(buttonView, R.string.swON, Snackbar.LENGTH_SHORT);
                        sn.setAction("undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                sC.toggle();
                            }
                        });
                }
                else {
                    sn = Snackbar.make(buttonView, R.string.swOFF, Snackbar.LENGTH_SHORT);
                }
                sn.show();
            }
        });


        }
    }
