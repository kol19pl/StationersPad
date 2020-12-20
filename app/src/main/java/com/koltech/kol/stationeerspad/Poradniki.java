package com.koltech.kol.stationeerspad;


import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Poradniki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poradniki);
    }
    public void solar1(View view){setContentView(R.layout.poradniki_esysolarpanel);}


    public void Timing(View view){setContentView(R.layout.poradniki_timing);}
    public void Timingshemat(View view){setContentView(R.layout.poradniki_timing_shemat);}

    public void autonight(View view){setContentView(R.layout.poradniki_autonight);}
    public void autonightshemat(View view){setContentView(R.layout.poradniki_autonight_shemat);}

    public void prostyprzeloncznik(View view){setContentView(R.layout.poradniki_przeloncznik);}

    public void automatedtemperatureregulation(View view){setContentView(R.layout.poradniki_automated_temperature_regulation);}


    public void wrucporadniki(View view){setContentView(R.layout.activity_poradniki);}





}
