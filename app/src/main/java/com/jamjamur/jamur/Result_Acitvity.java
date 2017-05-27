package com.jamjamur.jamur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Result_Acitvity extends AppCompatActivity {

    private Jamur j;
    private List<Jamur>LisJamurList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result__acitvity);
        initJamur();
    }

    private void initJamur()
    {
        j = new Jamur(1,"Jamur tiram putih (Pleoratus ostreatus)","Tidak berbau","Tidak ada","Tidak","kayu mati","des","image",0,"putih","tudung serong");
        LisJamurList.add(j);
        j = new Jamur(2,"Jamur tiram merah (Pleoratus ostreatus)","Tidak berbau","Tidak ada","Tidak","kayu mati","des","image",0,"merah semu","tudung serong");
        LisJamurList.add(j);
        j = new Jamur(3,"Jamur tiram kuning (Pleoratus ostreatus)","Tidak berbau","Tidak ada","Tidak","kayu mati","des","image",0,"kuning semu","tudung serong");
        LisJamurList.add(j);
        j = new Jamur(4,"Jamur merang putih (volvoriella volvaceae)","Tidak berbau","Tidak ada","Tidak","jerami","des","image",0,"putih","bulat");
        LisJamurList.add(j);
        j = new Jamur(5,"Jamur merang coklat (volvoriella volvaceae)","Tidak berbau","Tidak ada","Tidak","jerami","des","image",0,"coklat","bulat");
        LisJamurList.add(j);
        j = new Jamur(6,"Jamur Shiitake (Lentinula edodes)","Tidak berbau","Tidak ada","Tidak","kayu mati","des","image",0,"coklat","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(7,"Jamur Kuping coklat(Auricularia auricula)","Tidak berbau","Tidak ada","Ya","kayu mati","des","image",0,"coklat","cuping");
        LisJamurList.add(j);
        j = new Jamur(8,"Jamur Kuping hitam(Auricularia auricula)","Tidak berbau","Tidak ada","Ya","kayu mati","des","image",0,"hitam","cuping");
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
    }
    private Jamur InfrenceEngine()
    {
        for (int i=0;i<LisJamurList.size();i++)
        {
            if(!j.getWarna().equalsIgnoreCase(LisJamurList.get(i).getWarna()));
            {
                LisJamurList.remove(i);
            }
        }
        for (int i=0;i<LisJamurList.size();i++)
        {
            if(!j.getBentuk().equalsIgnoreCase(LisJamurList.get(i).getBentuk()));
            {
                LisJamurList.remove(i);
            }
        }
        for (int i=0;i<LisJamurList.size();i++)
        {
            if(!j.getHabitat().equalsIgnoreCase(LisJamurList.get(i).getHabitat()));
            {
                LisJamurList.remove(i);
            }
        }
        for (int i=0;i<LisJamurList.size();i++)
        {
            if(j.getBau()!=LisJamurList.get(i).getBau());
            {
                LisJamurList.remove(i);
            }
        }
        for (int i=0;i<LisJamurList.size();i++)
        {
            if(j.getCincin()!=LisJamurList.get(i).getCincin());
            {
                LisJamurList.remove(i);
            }
        }
        for (int i=0;i<LisJamurList.size();i++)
        {
            if(j.getLendir()!=LisJamurList.get(i).getLendir());
            {
                LisJamurList.remove(i);
            }
        }
        Jamur result;
        result=LisJamurList.get(0);
        return result;


    }

}
