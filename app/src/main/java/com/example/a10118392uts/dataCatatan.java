package com.example.a10118392uts;
/*
 * Tanggal pengerjaan : 3 Juni 2021
 * Nim                : 10118392
 * Nama               : Raden Arvin Rizky A
 * Kelas              : IF-9
 * */
public class dataCatatan {
    private String ID;
    private String TANGGAL;
    private String JUDUL;
    private String KATEGORI;
    private String CATATAN;



    public dataCatatan(){
    }

    public dataCatatan(String ID, String TANGGAL, String JUDUL, String KATEGORI, String CATATAN) {
        this.ID = ID;
        this.TANGGAL = TANGGAL;
        this.JUDUL = JUDUL;
        this.KATEGORI = KATEGORI;
        this.CATATAN = CATATAN;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTANGGAL() {
        return TANGGAL;
    }

    public void setTANGGAL(String TANGGAL) {
        this.TANGGAL = TANGGAL;
    }

    public String getJUDUL() {
        return JUDUL;
    }

    public void setJUDUL(String JUDUL) {
        this.JUDUL = JUDUL;
    }

    public String getKATEGORI() {
        return KATEGORI;
    }

    public void setKATEGORI(String KATEGORI) {
        this.KATEGORI = KATEGORI;
    }

    public String getCATATAN() {
        return CATATAN;
    }

    public void setCATATAN(String CATATAN) {
        this.CATATAN = CATATAN;
    }
}
