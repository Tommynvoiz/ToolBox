package com.example.tomas.myapplication;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by Tomas on 7/20/2015.
 */
public class AboutApps extends Activity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(int i) {

        FragmentManager manager= getFragmentManager();
        FragmentB f2 = (FragmentB) manager.findFragmentById(R.id.fragmentb);
        f2.changeData(i);
    }
}
