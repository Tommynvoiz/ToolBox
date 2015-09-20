package com.example.tomas.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.Random;

/**
 * Created by Tomas on 1/28/2015.
 */
public class ColorChange extends Activity {

    LinearLayout background1, background2, background3;
    RelativeLayout backgroundR;
    Button bGreen, bBlue, bRed, button;
    Random crazy = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_layout);

        backgroundR = (RelativeLayout) findViewById(R.id.backgroundR);
        background1 = (LinearLayout) findViewById(R.id.background1);
        background2 = (LinearLayout) findViewById(R.id.background2);
        background3 = (LinearLayout) findViewById(R.id.background3);
        bBlue = (Button) findViewById(R.id.bBlue);
        bGreen = (Button) findViewById(R.id.bGreen);
        bRed = (Button) findViewById(R.id.bRed);
        button = (Button) findViewById(R.id.button);

        bGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click the button

                background1.setBackgroundColor(Color.rgb(crazy.nextInt(265), crazy.nextInt(265), crazy.nextInt(265)));
                //background.setBackgroundColor(Color.parseColor("#00ff00"));


            }
        });

        bBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click the button
                background2.setBackgroundColor(Color.rgb(crazy.nextInt(265), crazy.nextInt(265), crazy.nextInt(265)));

            }
        });

        bRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click the button
                background3.setBackgroundColor(Color.rgb(crazy.nextInt(265), crazy.nextInt(265), crazy.nextInt(265)));

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click the button
                backgroundR.setBackgroundColor(Color.rgb(crazy.nextInt(265), crazy.nextInt(265), crazy.nextInt(265)));

            }
        });
    }
}