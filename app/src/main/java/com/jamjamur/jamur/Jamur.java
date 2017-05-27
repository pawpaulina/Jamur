package com.jamjamur.jamur;

import android.media.Image;

/**
 * Created by danang on 5/26/17.
 */

public class Jamur {

    private int id;
    private String nama;
    private String warna;
    private String bau;
    private String cincin;
    private String lendir;
    private int aman;
    private String habitat;
    private String deksripsi;
    private String image;
    private String bentuk;

    Jamur(int id,String nama,String bau,String cincin,String lendir,String habitat,String deksripsi,String image,int aman,String warna,String bentuk)
    {
        setId(id);
        setNama(nama);
        setBau(bau);
        setCincin(cincin);
        setLendir(lendir);
        setHabitat(habitat);
        setDeksripsi(deksripsi);
        setImage(image);
        setAman(aman);
        setBentuk(bentuk);
        setWarna(warna);
    }
    Jamur()
    {}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDeksripsi() {
        return deksripsi;
    }

    public void setDeksripsi(String deksripsi) {
        this.deksripsi = deksripsi;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public String getBau() {
        return bau;
    }

    public void setBau(String bau) {
        this.bau = bau;
    }

    public String getCincin() {
        return cincin;
    }

    public void setCincin(String cincin) {
        this.cincin = cincin;
    }

    public String getLendir() {
        return lendir;
    }

    public void setLendir(String lendir) {
        this.lendir = lendir;
    }

    public int getAman() {
        return aman;
    }

    public void setAman(int aman) {
        this.aman = aman;
    }
}
