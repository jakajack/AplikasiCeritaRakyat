package com.example.jaka.ceritarakyat.model;

/**
 * Created by Jaka on 6/24/2019.
 */

public class Halaman {
    private int mGambarId;
    private String mTeks;
    private  Pilihan mPilihan1;
    private  Pilihan mPilihan2;
    private  boolean mApakahSelesai = false;

    public  Halaman(int gambarId, String teks, Pilihan pilihan1, Pilihan pilihan2){
        mGambarId = gambarId;
        mTeks = teks;
        mPilihan1 = pilihan1;
        mPilihan2 = pilihan2;
    }

    public  Halaman (int gambarId, String teks){
        mGambarId = gambarId;
        mTeks = teks;
        mPilihan1 = null;
        mPilihan2 = null;
        mApakahSelesai = true;
    }

    public boolean isApakahSelesai() {
        return mApakahSelesai;
    }

    public void setmApakahSelesai(boolean mApakahSelesai) {
        this.mApakahSelesai = mApakahSelesai;
    }

    public int getGambarId() {
        return mGambarId;
    }

    public void setGambarId(int gambarId) {
        mGambarId = gambarId;
    }

    public String getTeks() {
        return mTeks;
    }

    public void setTeks(String teks) {
        mTeks = teks;
    }

    public Pilihan getPilihan1() {
        return mPilihan1;
    }

    public void setPilihan1(Pilihan pilihan1) {
        mPilihan1 = pilihan1;
    }

    public Pilihan getPilihan2() {
        return mPilihan2;
    }

    public void setPilihan2(Pilihan pilihan2) {
        mPilihan2 = pilihan2;
    }
}
