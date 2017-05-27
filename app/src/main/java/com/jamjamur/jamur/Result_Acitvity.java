package com.jamjamur.jamur;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Result_Acitvity extends AppCompatActivity {

    private Jamur jamur=new Jamur();
    private ArrayList<Jamur>LisJamurList=new ArrayList<>();
    private ArrayList<Jamur>LisPenampung1=new ArrayList<>();
    private ArrayList<Jamur>LisPenampung2=new ArrayList<>();
    private ArrayList<Jamur>LisPenampung3=new ArrayList<>();
    private ArrayList<Jamur>LisPenampung4=new ArrayList<>();
    private ArrayList<Jamur>LisPenampung5=new ArrayList<>();
    private ArrayList<Jamur>LisPenampung6=new ArrayList<>();

    private ImageView imagejamur;
    private TextView namajamur;
    private TextView deskripsijamur;
    private TextView bentukjamur;
    private TextView warnajamur;
    private TextView baujamur;
    private TextView cincinjamur;
    private TextView lendirjamur;
    private TextView habitatjamur;
    private Button btnkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result__acitvity);
        initJamur();
        imagejamur=(ImageView)findViewById(R.id.imagejamur);
        namajamur=(TextView) findViewById(R.id.namajamur);
        deskripsijamur=(TextView) findViewById(R.id.deskripsijamur);
        bentukjamur=(TextView) findViewById(R.id.bentukjamur);
        baujamur=(TextView) findViewById(R.id.baujamur);
        cincinjamur=(TextView) findViewById(R.id.cincinjamur);
        lendirjamur=(TextView) findViewById(R.id.lendirjamur);
        habitatjamur=(TextView) findViewById(R.id.habitatjamur);
        warnajamur = (TextView)findViewById(R.id.warnajamur);
        btnkembali = (Button)findViewById(R.id.btnKembali);

        Intent intent=getIntent();
        Bundle extras = intent.getExtras();
        String bentuk= extras.getString("bentuk");
        String warna= extras.getString("warna");
        String bau= extras.getString("bau");
        String cincin= extras.getString("cincin");
        String lendir= extras.getString("lendir");
        String habitat= extras.getString("habitat");


        jamur.setBentuk(bentuk);
        jamur.setWarna(warna);
        jamur.setBau(bau);
        jamur.setCincin(cincin);
        jamur.setLendir(lendir);
        jamur.setHabitat(habitat);

        InfrenceEngine();

        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });





    }

    private void initJamur()
    {
        Jamur j;

        j = new Jamur(1,"Jamur tiram putih (Pleoratus ostreatus)","Tidak berbau","Tidak ada","Tidak","kayu mati","des","jamur_tiram_putih",0,"putih","tudung serong");
        LisJamurList.add(j);
        j = new Jamur(2,"Jamur tiram merah (Pleoratus ostreatus)","Tidak berbau","Tidak ada","Tidak","kayu mati","des","jamur_tiram_pink",0,"merah semu","tudung serong");
        LisJamurList.add(j);
        j = new Jamur(3,"Jamur tiram kuning (Pleoratus ostreatus)","Tidak berbau","Tidak ada","Tidak","kayu mati","des","jamur_tiram_kuning",0,"kuning semu","tudung serong");
        LisJamurList.add(j);
        j = new Jamur(4,"Jamur merang putih (volvoriella volvaceae)","Tidak berbau","Tidak ada","Tidak","jerami","des","jamur_merang_putih",0,"putih","bulat");
        LisJamurList.add(j);
        j = new Jamur(5,"Jamur merang coklat (volvoriella volvaceae)","Tidak berbau","Tidak ada","Tidak","jerami","des","jamur_merang_coklat",0,"coklat","bulat");
        LisJamurList.add(j);
        j = new Jamur(6,"Jamur Shiitake (Lentinula edodes)","Tidak berbau","Tidak ada","Tidak","kayu mati","des","jamur_shitake",0,"coklat","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(7,"Jamur Kuping coklat(Auricularia auricula)","Tidak berbau","Tidak ada","Ya","kayu mati","des","jamur_kuping_coklat",0,"coklat","cuping");
        LisJamurList.add(j);
        j = new Jamur(8,"Jamur Kuping hitam(Auricularia auricula)","Tidak berbau","Tidak ada","Ya","kayu mati","des","jamur_kuping_hitam",0,"hitam","cuping");
        LisJamurList.add(j);
        j = new Jamur(9,"Jamur Maitake (Grifola frondosa)","Tidak berbau","Tidak ada","Tidak","kayu mati","des","image",0,"hitam","cuping");
        LisJamurList.add(j);
        j = new Jamur(10,"Jamur Bulan (Gymnopus sp)","Tidak berbau","Tidak ada","Tidak","tanah","des","image",0,"kuning semu","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(11,"Jamur Bulat (Lycoperdun perlatum)","Tidak berbau","Tidak ada","Tidak","padang rumput","des","image",0,"putih","bulat");
        LisJamurList.add(j);
        j = new Jamur(12,"Jamur barat (Clitocybe nebularis)","Bau","Tidak ada","Tidak","tanah","des","image",0,"coklat semu","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(13,"Jamur Ling Zhi (Ganoderma lucidum)","Tidak berbau","Tidak ada","Tidak","kayu mati","des","image",0,"coklat","tudung serong");
        LisJamurList.add(j);
        j = new Jamur(14,"Jamur chanterelle (Cantharellus cibarius)","Bau","Tidak ada","Tidak","tanah","des","image",0,"kuning","corong");
        LisJamurList.add(j);
        j = new Jamur(15,"Jamur landak (Hydnum repandum)","Bau","Tidak ada","Tidak","hutan pohon kayu","des","image",0,"oranye semu","tudung datar");
        LisJamurList.add(j);
        j = new Jamur(16,"Jamur surai singa (Hericium erinaceus)","Tidak berbau","Tidak ada","Tidak","kayu mati","des","image",0,"kuning semu","rumbai");
        LisJamurList.add(j);
        j = new Jamur(17,"Jamur matsutake (Tricholoma matsutake)","Bau","Ada","Tidak","dasar pohon","des","image",0,"coklat","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(18,"Jamur Amanita (Amanita muscaria)","Tidak berbau","Ada","Tidak","dasar pohon","des","image",0,"merah bintik","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(19,"Jamur Supa Kakabu (Boletus sp)","Tidak berbau","tidak ada","Tidak","dasar pohon","des","image",0,"coklat","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(20,"Jamur Supa Rampak (Coprinus)","Tidak berbau","ada","ya","jerami","des","image",0,"coklat","tudung kerucut");
        LisJamurList.add(j);
        j = new Jamur(21,"Jamur Cortinarius","Tidak berbau","tidak ada","tidak","tanah","des","image",0,"biru","tudung datar");
        LisJamurList.add(j);
        j = new Jamur(22,"Jamur Lactarius indigo","Tidak berbau","tidak ada","ya","dasar pohon","des","image",0,"biru","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(23,"Jamur lepiot","Tidak berbau","ada","tidak","hutan pohon kayu","des","image",0,"coklat bintik","tudung oval");
        LisJamurList.add(j);
        j = new Jamur(24,"Jamur morsel","Tidak berbau","tidak ada","tidak","kayu mati","des","image",0,"coklat","tudung tak berbentuk");
        LisJamurList.add(j);
        j = new Jamur(25,"Jamur poliot","Tidak berbau","tidak ada","tidak","kayu mati","des","image",0,"kuning","tudung datar");
        LisJamurList.add(j);
        j = new Jamur(26,"Jamur phallus","bau","ada","ya","hutan pohon kayu","des","image",0,"kuning semu","tudung datar");
        LisJamurList.add(j);
        j = new Jamur(27,"Jamur russula","tidak berbau","tidak ada","ya","kayu mati","des","image",0,"merah","tudung datar");
        LisJamurList.add(j);
        j = new Jamur(28,"Jamur boletus","tidak berbau","tidak ada","tidak","tanah","des","image",0,"coklat","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(29,"Jamur kancing (Agaricus bisporus)","tidak berbau","ada","tidak","jerami","des","image",0,"putih","tudung cembung");
        LisJamurList.add(j);
    }
    private void InfrenceEngine()
    {
        for (int i=0;i<LisJamurList.size();i++)
        {
            if(LisJamurList.get(i).getWarna().toString().equalsIgnoreCase(jamur.getWarna()))
            {
                LisPenampung1.add(LisJamurList.get(i));
            }
        }
        for (int i=0;i<LisPenampung1.size();i++)
        {
            if(jamur.getBentuk().equalsIgnoreCase(LisPenampung1.get(i).getBentuk()))
            {
                LisPenampung2.add(LisPenampung1.get(i));
            }
        }
        for (int i=0;i<LisPenampung2.size();i++)
        {
            if(jamur.getHabitat().equalsIgnoreCase(LisPenampung2.get(i).getHabitat()))
            {
                LisPenampung3.add(LisPenampung2.get(i));
            }
        }
        for (int i=0;i<LisPenampung3.size();i++)
        {
            if(jamur.getBau().equalsIgnoreCase(LisPenampung3.get(i).getBau()))
            {
                LisPenampung4.add(LisPenampung3.get(i));
            }
        }
        for (int i=0;i< LisPenampung4.size();i++)
        {
            if(jamur.getCincin().equalsIgnoreCase(LisPenampung4.get(i).getCincin()))
            {
                LisPenampung5.add(LisPenampung4.get(i));
            }
        }
        for (int i=0;i<LisPenampung5.size();i++)
        {
            if(jamur.getLendir().equalsIgnoreCase(LisPenampung5.get(i).getLendir()))
            {
                LisPenampung6.add(LisPenampung5.get(i));
            }
        }



                if(LisPenampung6.size()==0) {
                    Toast.makeText(Result_Acitvity.this,"Jamur tidak ditemukan ", Toast.LENGTH_LONG).show();
                }
                else {
                    String uri = "@drawable/"+LisPenampung6.get(0).getImage();  // where myresource (without the extension) is the file
                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                    imagejamur= (ImageView)findViewById(R.id.imagejamur);
                    Drawable res = getResources().getDrawable(imageResource);
                    imagejamur.setImageDrawable(res);
                    namajamur.setText(LisPenampung6.get(0).getNama());
                    deskripsijamur.setText(LisPenampung6.get(0).getDeksripsi());
                    bentukjamur.setText(LisPenampung6.get(0).getBentuk());
                    baujamur.setText(LisPenampung6.get(0).getBau());
                    cincinjamur.setText(LisPenampung6.get(0).getCincin());
                    lendirjamur.setText(LisPenampung6.get(0).getLendir());
                    habitatjamur.setText(LisPenampung6.get(0).getHabitat());
                    warnajamur.setText(LisPenampung6.get(0).getWarna());
                }



    }

}
