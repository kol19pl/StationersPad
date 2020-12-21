package com.koltech.kol.stationeerspad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.koltech.kol.stationeerspad.Category.Ore;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_main);

    }


    //stopy metali
    public void openstopy(View view) {
      //  setContentView(R.layout.activity_stopy_metali);
    }

    public void potadniki(View view){
      // Intent poradnik = new Intent(this,Poradniki.class);
     //  startActivity(poradnik);

    }

    public void Ore(View view){
        Intent serwer = new Intent(this, Ore.class);
        startActivity(serwer);

    }


    public void serwer(View view){
        Intent serwer = new Intent(this,Dedikatedserwer.class);
        startActivity(serwer);

    }








    @Override
   // public void onBackPressed() {setContentView(R.layout.p); }
    public void onBackPressed() {
      //  setContentView(R.layout.activity_start_main_nadzorca);
    }


    ///przejscie na stronę
    public void strona(View view){Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://stationeers-wiki.com/Main_Page"));
        startActivity(intent);
    }

    public void aktualizacje(View view) {
        Intent aktualizacje = new Intent(this, Aktualizacje.class);
        startActivity(aktualizacje);

    }
}
