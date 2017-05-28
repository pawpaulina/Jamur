package com.jamjamur.jamur;

import android.content.Intent;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

/**
 * Created by Paulina on 5/26/2017.
 */
public class SplashScreenActivity extends AwesomeSplash {
    public void initSplash(ConfigSplash configSplash) {

            /* you don't have to override every property */

        //Customize Circular Reveal
        configSplash.setBackgroundColor(R.color.colorPrimary); //any color you want form colors.xml
        configSplash.setAnimCircularRevealDuration(2000); //int ms
        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagY(Flags.REVEAL_TOP);//or Flags.REVEAL_TOP

        //Choose LOGO OR PATH; if you don't provide String value for path it's logoawal by default

        //Customize Logo
        configSplash.setLogoSplash(R.drawable.logo); //or any other drawable
        configSplash.setAnimLogoSplashDuration(2000); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.Bounce); //choose one form Techniques (ref: https://github.com/daimajia/AndroidViewAnimations)


        //Customize Path
        // configSplash.setPathSplash(SyncStateContract.Constants.DROID_LOGO); //set path String
        configSplash.setOriginalHeight(400); //in relation to your svg (path) resource
        configSplash.setOriginalWidth(400); //in relation to your svg (path) resource
        configSplash.setAnimPathStrokeDrawingDuration(3000);
        configSplash.setPathSplashStrokeSize(3); //I advise value be <5
        configSplash.setPathSplashStrokeColor(R.color.colorPrimaryDark); //any color you want form colors.xml
        configSplash.setAnimPathFillingDuration(3000);
        configSplash.setPathSplashFillColor(R.color.colorPrimaryDark); //path object filling color


        //Customize Title
        configSplash.setTitleSplash("DerFungi");
        //configSplash.setTitleTextColor(R.color.Wheat);
        configSplash.setTitleTextSize(30f); //float value
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.FlipInX);
        //configSplash.setTitleFont("fonts/myfont.ttf"); //provide string to your font located in assets/fonts/**/

    }

    @Override
    public void animationsFinished() {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        setContentView(R.layout.activity_main);

        //transit to another activity here
        //or do whatever you want
    }
}