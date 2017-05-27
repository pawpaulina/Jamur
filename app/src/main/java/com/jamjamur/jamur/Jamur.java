package com.jamjamur.jamur;

import android.media.Image;

/**
 * Created by danang on 5/26/17.
 */

public class Jamur {

    private int id;
    private String nama;
    private String warna;
    private int bau;
    private int cincin;
    private int lendir;
    private int aman;
    private String habitat;
    private String deksripsi;
    private String image;
    private String bentuk;

    Jamur(int id,String nama,int bau,int cincin,int lendir,String habitat,String deksripsi,String image,int aman,String warna,String bentuk)
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

    public int getBau() {
        return bau;
    }

    public void setBau(int bau) {
        this.bau = bau;
    }

    public int getCincin() {
        return cincin;
    }

    public void setCincin(int cincin) {
        this.cincin = cincin;
    }

    public int getLendir() {
        return lendir;
    }

    public void setLendir(int lendir) {
        this.lendir = lendir;
    }

    public int getAman() {
        return aman;
    }

    public void setAman(int aman) {
        this.aman = aman;
    }
}
