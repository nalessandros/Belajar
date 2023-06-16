package com.rplbo.uaspoli;

public class Telor1 extends Condiment{
    private String namaAyamSuwir = "telor 1";
    private int HargaAyamSuwir = 4000;
    public Telor1(Makanan makanan){
        super(makanan);
    }
    @Override
    public String getNama(){
        return super.getNama() +" " +this.getNamaAyamSuwir();
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
