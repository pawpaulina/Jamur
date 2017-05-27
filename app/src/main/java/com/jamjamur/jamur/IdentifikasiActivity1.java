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
public class IdentifikasiActivity1 extends AppCompatActivity {
    private String[] arrayBentuk;
    private String[] arrayWarna;
    private String[] arrayBau;

    private Spinner spinnerBentuk;
    private Spinner spinnerWarna;
    private Spinner spinnerBau;



    private Button btnLanjut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identifikasi);

        this.arrayBentuk = new String[]{"Bulat", "Tudung serong", "Tudung datar", "Cuping", "Tudung cembung","Tudung kerucut","Rumbai","Tudung oval","Tudung tak berbentuk"};
        spinnerBentuk = (Spinner) findViewById(R.id.SpinBentuk);
        ArrayAdapter<String> adapterBentuk = new ArrayAdapter<String>(this, R.layout.spinner_layout, arrayBentuk);
        spinnerBentuk.setAdapter(adapterBentuk);

        this.arrayWarna = new String[]{"Biru", "Coklat", "Coklat semu", "Coklat bintik", "Hitam", "Kuning", "Kuning semu", "Kuning bintik","Oranye", "Oranye semu", "Merah", "Merah Semu","Merah bintik", "Putih", "Putih semu"};
        spinnerWarna = (Spinner) findViewById(R.id.SpinWarna);
        ArrayAdapter<String> adapterWarna = new ArrayAdapter<String>(this, R.layout.spinner_layout, arrayWarna);
        spinnerWarna.setAdapter(adapterWarna);

        this.arrayBau = new String[]{"Bau", "Tidak Berbau"};
        spinnerBau = (Spinner) findViewById(R.id.SpinBau);
        ArrayAdapter<String> adapterBau = new ArrayAdapter<String>(this, R.layout.spinner_layout, arrayBau);
        spinnerBau.setAdapter(adapterBau);

        btnLanjut = (Button) findViewById(R.id.btnLanjut);
    }

    public void btnLanjut(View v)
    {
        String bentuk = spinnerBentuk.getSelectedItem().toString();
        String warna = spinnerWarna.getSelectedItem().toString();
        String bau = spinnerBau.getSelectedItem().toString();


        Intent i = new Intent(getApplicationContext(), IdentifikasiActivity2.class);
        i.putExtra("bentuk", bentuk);
        i.putExtra("warna", warna);
        i.putExtra("bau", bau);
        startActivity(i);
    }
}
