package com.jamjamur.jamur;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.gson.Gson;

/**
 * Created by Paulina on 5/26/2017.
 */
public class IdentifikasiActivity2 extends AppCompatActivity {
    private String[] arrayCincin;
    private String[] arrayLendir;
    private String[] arrayHabitat;

    private Spinner spinnerCincin;
    private Spinner spinnerLendir;
    private Spinner spinnerHabitat;

    private Button btnLanjut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identifikasi2);

        this.arrayCincin = new String[]{"Ada", "Tidak Ada"};
        spinnerCincin = (Spinner) findViewById(R.id.SpinCincin);
        ArrayAdapter<String> adapterCincin = new ArrayAdapter<String>(this, R.layout.spinner_layout, arrayCincin);
        spinnerCincin.setAdapter(adapterCincin);

        this.arrayLendir = new String[]{"Ya", "Tidak"};
        spinnerLendir = (Spinner) findViewById(R.id.SpinLendir);
        ArrayAdapter<String> adapterLendir = new ArrayAdapter<String>(this, R.layout.spinner_layout, arrayLendir);
        spinnerLendir.setAdapter(adapterLendir);

        this.arrayHabitat = new String[]{"Jerami", "Kayu Mati", "Tanah","Padang rumput","Dasar pohon","Hutan pohon kayu"};
        spinnerHabitat = (Spinner) findViewById(R.id.SpinHabitat);
        ArrayAdapter<String> adapterHabitat = new ArrayAdapter<String>(this, R.layout.spinner_layout, arrayHabitat);
        spinnerHabitat.setAdapter(adapterHabitat);

        btnLanjut = (Button) findViewById(R.id.btnLanjut2);
    }

    public void btnLanjut2(View v)
    {
        String bentuk ;
        String warna ;
        String bau ;
        String cincin = spinnerCincin.getSelectedItem().toString();
        String lendir = spinnerLendir.getSelectedItem().toString();
        String habitat = spinnerHabitat.getSelectedItem().toString();

        Intent intent=getIntent();
        Bundle extras = intent.getExtras();
        bentuk= extras.getString("bentuk");
        warna= extras.getString("warna");
        bau= extras.getString("bau");

        Intent i = new Intent(getApplicationContext(),Result_Acitvity.class);
        i.putExtra("bentuk", bentuk);
        i.putExtra("warna", warna);
        i.putExtra("bau", bau);
        i.putExtra("cincin", cincin);
        i.putExtra("lendir", lendir);
        i.putExtra("habitat", habitat);
        startActivity(i);
    }
}
