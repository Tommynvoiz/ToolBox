package com.example.tomas.myapplication;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
/**
 * Created by Tomas on 1/20/2015.
 */
public class Menu extends ListActivity {

    String classes[] = { "Counter", "TextPlay", "ColorChange", "TipCalculator", "FuelCalculator", "AboutApps"};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes) );
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){

        super.onListItemClick(l, v, position, id);
        String xxx = classes[position];
        try {
            Class myClass = Class.forName("com.example.tomas.myapplication." + xxx);
            Intent intent = new Intent(Menu.this, myClass);
            startActivity(intent);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
