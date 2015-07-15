package com.example.tomas.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
/**
 * Created by Tomas on 2/4/2015.
 */
public class FuelCalculator extends Activity{

    private double distance = 0.0;
    private double fuel = 0.0;
    private double totalfuel = 0.0;

    EditText km;
    EditText liters;
    EditText total;

    Button submit;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fuelcalculator);

        km = (EditText) findViewById(R.id.kmEditText);
        liters = (EditText) findViewById(R.id.litersEditText);
        total = (EditText) findViewById(R.id.editText1);

        submit = (Button) findViewById(R.id.button);
        reset = (Button) findViewById(R.id.button1);



        setButtonOnClickListeners();

    }

    private void setButtonOnClickListeners(){

        submit.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View arg0) {

                distance = Double.parseDouble(km.getText().toString());
                fuel = Double.parseDouble(liters.getText().toString());
                totalfuel = fuel / 100 * distance;
                total.setText(String.format("%.02f", totalfuel ));
            }


        });

        reset.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {

                distance = 0.0;
                fuel = 0.0;
                totalfuel = 0.0;

                km.setText(String.format("%.02f", distance ));
                liters.setText(String.format("%.02f", fuel ));
                total.setText(String.format("%.02f", totalfuel ));

            }

        });

    }
}
