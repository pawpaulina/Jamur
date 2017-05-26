package com.jamjamur.jamur;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

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

        this.arrayHabitat = new String[]{"Jerami", "Kayu Mati"};
        spinnerHabitat = (Spinner) findViewById(R.id.SpinHabitat);
        ArrayAdapter<String> adapterHabitat = new ArrayAdapter<String>(this, R.layout.spinner_layout, arrayHabitat);
        spinnerHabitat.setAdapter(adapterHabitat);

        btnLanjut = (Button) findViewById(R.id.btnLanjut2);
    }

    public void btnLanjut2(View v)
    {
        String cincin = spinnerCincin.getSelectedItem().toString();
        String lendir = spinnerLendir.getSelectedItem().toString();
        String habitat = spinnerHabitat.getSelectedItem().toString();

//        Intent i = new Intent(getApplicationContext(), IdentifikasiActivity2.class);
//        startActivity(i);
    }
}
