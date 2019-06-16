package com.koltech.kol.stationeerspad;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;


public class MainActivity extends AppCompatActivity implements RewardedVideoAdListener {

    private AdView mAdView;
    WebView wv;
 //   private AdView poprzednie;
 private RewardedVideoAd mRewardedVideoAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_start_main_nadzorca);
///wsparcie
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd.setRewardedVideoAdListener(this);



        ///baner

        MobileAds.initialize(this,"ca-app-pub-4834003578511022/3463615091");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        //setContentView(R.layout.activity_start);
     //   try {
     //       wait(30);
     //   } catch (InterruptedException e) {
     //       e.printStackTrace();
     //   }
       // setContentView(R.layout.activity_start);

    }


    //stopy metali
    public void openstopy(View view) {
        setContentView(R.layout.activity_stopy_metali);
    }

    public void openstopyconstantan(View view) {
        setContentView(R.layout.stopy_constantan);
    }
    public void openstopyelectrum(View view) {
        setContentView(R.layout.stopy_electrum);
    }
    public void openstopyinvar(View view) {
        setContentView(R.layout.stopy_invar);
    }
    public void openstopysolder(View view) {
        setContentView(R.layout.stopy_solder_);
    }
    public void openstopystal(View view) {
        setContentView(R.layout.stopy_stal);
    }

    //paliwo
    public void openpaliwo(View view) {
        setContentView(R.layout.paliwo);
    }

    //piec
    public void openpiec(View view) { setContentView(R.layout.piec); }
    public void openpiecdane(View view) { setContentView(R.layout.piec_dane); }



    //rudy
    public void openrudy(View view) {
        setContentView(R.layout.nadzorca_rudy);
    }

    public void openwengiel(View view) {
        setContentView(R.layout.wengiel);
    }
    public void openmiedz(View view) {
        setContentView(R.layout.miedz);
    }
    public void openzloto(View view) {
        setContentView(R.layout.zloto);
    }
    public void openzelazo(View view) {
        setContentView(R.layout.zelazo);
    }
    public void openoluw(View view) {
        setContentView(R.layout.oluw);
    }
    public void opennikel(View view) {
        setContentView(R.layout.nikel);
    }
    public void openkrzem(View view) {
        setContentView(R.layout.krzem);
    }
    public void opensrebro(View view) {
        setContentView(R.layout.srebro);
    }
    public void openuran(View view) {
        setContentView(R.layout.uran);
    }
    public void openlud(View view) {
        setContentView(R.layout.lud);
    }
    ///lud
    public void openlud_tlen(View view) {
        setContentView(R.layout.lud_tlen);
    }
    public void openlud_woda(View view) {
        setContentView(R.layout.lud_woda);
    }
    public void openlud_wodur(View view) {
        setContentView(R.layout.lud_wodur);
    }

    //twurca
    public void twurca(View view) {
        setContentView(R.layout.twurca);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
    public void potadniki(View view){
       Intent poradnik = new Intent(this,Poradniki.class);
       startActivity(poradnik);

    }
    public void serwer(View view){
        Intent serwer = new Intent(this,Dedikatedserwer.class);
        startActivity(serwer);

    }






    public void wsparcie(View view){

    if (mRewardedVideoAd.isLoaded()) {
        mRewardedVideoAd.show();
    }
}

    private void loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd("ca-app-pub-4834003578511022/2555811815",
                new AdRequest.Builder().build());
    }


    @Override
   // public void onBackPressed() {setContentView(R.layout.p); }
    public void onBackPressed() {setContentView(R.layout.activity_start_main_nadzorca);
    mAdView = findViewById(R.id.adView);
    AdRequest adRequest = new AdRequest.Builder().build();
    mAdView.loadAd(adRequest);}

    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {
        loadRewardedVideoAd();
    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }
    ///przejscie na stronę
    public void strona(View view){Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://stationeers-wiki.com/Main_Page"));
        startActivity(intent);
    }

    public void aktualizacje(View view) {
            setContentView(R.layout.aktualizacje);

            wv = (WebView) findViewById(R.id.wv);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
            wv.getSettings().setDomStorageEnabled(true);
            wv.getSettings().setDatabaseEnabled(true);
            wv.getSettings().setAppCacheEnabled(true);
            wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

            wv.loadUrl("https://steamcommunity.com/app/544550/allnews/");

    }
}
