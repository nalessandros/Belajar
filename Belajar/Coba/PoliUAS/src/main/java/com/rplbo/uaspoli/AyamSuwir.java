package com.rplbo.uaspoli;

public class AyamSuwir extends Condiment{
    private int HargaAyamSuwir = 6000;
    private String namaAyamSuwir = "ayam suwir";
    public AyamSuwir(Makanan makanan){
        super(makanan);
    }
    @Override
    public String getNama(){
        return super.getNama() + " " +this.getNamaAyamSuwir();
    }
    @Override
    public int getHarga(){
        return super.getHarga() + this.getHargaAyamSuwir();
    }
    public String getNamaAyamSuwir(){
        return this.namaAyamSuwir;
    }
    public int getHargaAyamSuwir(){
        return this.HargaAyamSuwir;
    }
    //setter
    public void setNamaAyamSuwir(String namaAyamSuwir){
        this.namaAyamSuwir = namaAyamSuwir;
    }
    public void setHargaAyamSuwir(int hargaAyamSuwir){
        this.HargaAyamSuwir = hargaAyamSuwir;
    }



}
