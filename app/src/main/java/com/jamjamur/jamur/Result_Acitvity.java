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
