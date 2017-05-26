package com.jamjamur.jamur;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Paulina on 5/26/2017.
 */
public class IdentifikasiActivity1 extends AppCompatActivity {

    private Button btnLanjut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identifikasi);

        btnLanjut = (Button) findViewById(R.id.btnLanjut);
    }

    public void btnLanjut(View v)
    {
        Intent i = new Intent(getApplicationContext(), IdentifikasiActivity2.class);
        startActivity(i);
    }
}
