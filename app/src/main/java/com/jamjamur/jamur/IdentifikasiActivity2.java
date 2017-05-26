package com.jamjamur.jamur;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by Paulina on 5/26/2017.
 */
public class IdentifikasiActivity2 extends AppCompatActivity {
    private Button btnLanjut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identifikasi2);
        btnLanjut = (Button) findViewById(R.id.btnLanjut2);
    }
}
