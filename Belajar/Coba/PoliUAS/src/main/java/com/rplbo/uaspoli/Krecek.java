package com.rplbo.uaspoli;

public class Krecek extends Condiment{
    private String namaKrecek = "krecek";
    private int HargaKrecek = 3500;

    public Krecek(Makanan makanan){
        super(makanan);
    }
    @Override
    public String getNama(){
        return super.getNama() +" " +this.getNamaKrecek();
    }
    @Override
    public int getHarga(){
        return super.getHarga() + 3500;
    }
    
    public String getNamaKrecek(){
        return this.namaKrecek;
    }
    public int getHargaKrecek(){
        return this.HargaKrecek;
    }
    
}
