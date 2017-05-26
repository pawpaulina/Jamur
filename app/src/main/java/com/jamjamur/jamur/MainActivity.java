package com.jamjamur.jamur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mulai = (Button) findViewById(R.id.btnMulai);
    }

    public void btnMulai(View v)
    {
        Intent i = new Intent(getApplicationContext(), IdentifikasiActivity1.class);
        startActivity(i);
    }
}
