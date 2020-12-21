package com.koltech.kol.stationeerspad.Category;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import com.koltech.kol.stationeerspad.Aktualizacje;
import com.koltech.kol.stationeerspad.R;

public class Ore extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    Intent OreVivev;
    Switch switchOre;
    Switch switchOreTop;
    ScrollView scrollOre;
    ScrollView scrollOreTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.ores_main);

        switchOre = findViewById(R.id.switchOres);
        switchOreTop = findViewById(R.id.switchFrozenOres);
        scrollOre = findViewById(R.id.ScrolOres);
        scrollOreTop = findViewById(R.id.scrolFrozenores);



        switchOre.setOnCheckedChangeListener(this);
        switchOreTop.setOnCheckedChangeListener(this);


        OreVivev = new Intent(this, OreViev.class);


    }


    /**
     * Called when the checked state of a compound button has changed.
     *
     * @param buttonView The compound button view whose state has changed.
     * @param isChecked  The new checked state of buttonView.
     */
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(switchOre.isChecked()){
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
            scrollOre.setLayoutParams(layoutParams);

        }
        if(!switchOre.isChecked()){
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0);
            scrollOre.setLayoutParams(layoutParams);

        }
        if(switchOreTop.isChecked()){
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
            scrollOreTop.setLayoutParams(layoutParams);

        }
        if(!switchOreTop.isChecked()){
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0);
            scrollOreTop.setLayoutParams(layoutParams);

        }
    }


    void OreWengiel(View v){

        OreVivev.putExtra("Cel", "Wengiel");
        startActivity(OreVivev);
    }
    void OreCopper(View v){

        OreVivev.putExtra("Cel", "Copper");
        startActivity(OreVivev);
    }
    void OreIron(View v){

        OreVivev.putExtra("Cel", "Iron");
        startActivity(OreVivev);
    }
    void OreNikiel(View v){

        OreVivev.putExtra("Cel", "Nikiel");
        startActivity(OreVivev);
    }
    void OreKrzem(View v){

        OreVivev.putExtra("Cel", "Krzem");
        startActivity(OreVivev);
    }
    void OreUran(View v){

        OreVivev.putExtra("Cel", "Uran");
        startActivity(OreVivev);
    }
    void Orewegel(View v){

        OreVivev.putExtra("Cel", "wegel");
        startActivity(OreVivev);
    }
    void OreGold(View v){

        OreVivev.putExtra("Cel", "Gold");
        startActivity(OreVivev);
    }
    void OreOlow(View v){

        OreVivev.putExtra("Cel", "Olow");
        startActivity(OreVivev);
    }
    void OreMix(View v){

        OreVivev.putExtra("Cel", "Mix");
        startActivity(OreVivev);
    }
    void OreSrebro(View v){

        OreVivev.putExtra("Cel", "Srebro");
        startActivity(OreVivev);
    }



    void OreWoda(View v){

        OreVivev.putExtra("Cel", "Woda");
        startActivity(OreVivev);
    }
    void OreTlenek(View v){

        OreVivev.putExtra("Cel", "Tlenek");
        startActivity(OreVivev);
    }

    void OreSublatwopalne(View v){

        OreVivev.putExtra("Cel", "Sublatwopalne");
        startActivity(OreVivev);
    }
}
