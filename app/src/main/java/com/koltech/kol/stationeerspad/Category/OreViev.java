package com.koltech.kol.stationeerspad.Category;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import com.koltech.kol.stationeerspad.R;

public class OreViev extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("Cel");
            Gen(value);
            //lewel = Integer.parseInt(value);
        }

     //   setContentView(R.layout.ores_main);



    }

    void Gen(String value){

    }


}
