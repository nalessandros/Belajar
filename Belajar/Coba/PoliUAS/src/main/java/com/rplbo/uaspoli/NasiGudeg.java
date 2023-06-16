package com.rplbo.uaspoli;

public class NasiGudeg implements Makanan{
    private String nama;
    private int Harga;

    //konstruktor
    public NasiGudeg(){
        this.nama = "nasi gudeg";
        this.Harga = 5000;
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
