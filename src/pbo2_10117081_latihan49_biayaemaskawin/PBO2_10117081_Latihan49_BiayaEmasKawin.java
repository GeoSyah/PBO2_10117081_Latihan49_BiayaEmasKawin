/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan49_biayaemaskawin;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Menghitung harga mas kawin pergramnya
 */
public class PBO2_10117081_Latihan49_BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HargaBeli beli = new HargaBeli();
        beli.setEmasKawin(15.7);
        beli.setHarga(570000);
        
        System.out.println("Hendri membeli emas kawin : " + beli.getEmasKawin() 
                + " gram");
        System.out.println("Harga 1 gram emas per bulan oktober ini : Rp. " 
                + beli.getHarga());
        System.out.println();
        
        double emasKawin = beli.getEmasKawin();
        double harga = beli.getHarga();
        
        System.out.println("Total pembayaran yang harus dikeluarkan : Rp. " 
                + beli.hitungTotalPembayaran(emasKawin, harga));

    }
    
}
