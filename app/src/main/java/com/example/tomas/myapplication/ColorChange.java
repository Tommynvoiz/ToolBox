package com.example.tomas.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
/**
 * Created by Tomas on 1/28/2015.
 */
public class ColorChange extends Activity {

    LinearLayout background;
    Button bGreen, bBlue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_layout);

        background = (LinearLayout) findViewById(R.id.background);
        bBlue = (Button) findViewById(R.id.bBlue);
        bGreen = (Button) findViewById(R.id.bGreen);

        bGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click the button
                background.setBackgroundColor(Color.parseColor("#00ff00"));
            }
        });

        bBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click the button
                background.setBackgroundColor(Color.parseColor("#006699"));
            }
        });

    }
}
