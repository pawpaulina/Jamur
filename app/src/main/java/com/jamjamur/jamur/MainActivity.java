package com.jamjamur.jamur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ImageButton mulai;
//    private GifImageView iView;
    private List<Jamur> jamurList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        iView = (GifImageView) findViewById(R.id.logoawal);
//        iView.setBytes(bitmapData);
        mulai = (ImageButton) findViewById(R.id.btnMulai);
//        mulai.setBackgroundResource(R.drawable.logoawal);
        mulai.isPressed();
    }

    @Override
    protected void onStart() {
        super.onStart();
//        iView.startAnimation();
    }

    @Override
    protected void onStop() {
        super.onStop();
//        iView.stopAnimation();
    }

    public void btnMulai(View v)
    {
        Intent i = new Intent(getApplicationContext(), IdentifikasiActivity1.class);
        startActivity(i);
    }
}
