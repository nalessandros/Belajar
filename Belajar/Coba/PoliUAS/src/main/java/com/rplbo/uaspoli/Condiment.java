package com.rplbo.uaspoli;

public class Condiment implements Makanan{
    private String nama;
    private int Harga;
    //konstruktor
    public Condiment(Makanan makanan){
        this.nama = makanan.getNama();
        this.Harga = makanan.getHarga();
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
