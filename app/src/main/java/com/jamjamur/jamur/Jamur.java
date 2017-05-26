package com.jamjamur.jamur;

import android.media.Image;

/**
 * Created by danang on 5/26/17.
 */

public class Jamur {

    private int id;
    private String nama;
    private boolean bau;
    private boolean cincin;
    private boolean lendir;
    private String habitat;
    private String deksripsi;
    private String image;
    private boolean aman;

    Jamur(int id,String nama,boolean bau,boolean cincin,boolean lendir,String habitat,String deksripsi,String image,boolean aman)
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

    public boolean isBau() {
        return bau;
    }

    public void setBau(boolean bau) {
        this.bau = bau;
    }

    public boolean isCincin() {
        return cincin;
    }

    public void setCincin(boolean cincin) {
        this.cincin = cincin;
    }

    public boolean isLendir() {
        return lendir;
    }

    public void setLendir(boolean lendir) {
        this.lendir = lendir;
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

    public boolean isAman() {
        return aman;
    }

    public void setAman(boolean aman) {
        this.aman = aman;
    }
}
