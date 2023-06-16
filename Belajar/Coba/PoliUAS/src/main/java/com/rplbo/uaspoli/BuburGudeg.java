package com.rplbo.uaspoli;

public class BuburGudeg implements Makanan{
    private String nama;
    private int Harga;

    // KOntruktor
    public BuburGudeg(){
        this.nama = "bubur gudeg";
        this.Harga = 4000;
    }
    @Override
    public String getNama(){
        return this.nama;
    }
    @Override
    public int getHarga(){
        return this.Harga;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setHarga(int harga){
        this.Harga = harga;
    }
}
