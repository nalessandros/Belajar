package com.rplbo.parkirjdbc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ParkirApp pa = new ParkirApp();

        pa.koneksi();
        //pa.tambahData();
        pa.tampilData();
        pa.totalPemasukan();
        //pa.delete();
    }
}
