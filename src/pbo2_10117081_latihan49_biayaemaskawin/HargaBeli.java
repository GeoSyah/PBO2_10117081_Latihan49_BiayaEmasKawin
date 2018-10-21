/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan49_biayaemaskawin;

/**
 *
 * @author Geo Syah Alkautsar
 */
class HargaBeli {
    private double emasKawin;
    private double harga;

    public double getEmasKawin() {
        return emasKawin;
    }

    public void setEmasKawin(double emasKawin) {
        this.emasKawin = emasKawin;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double hitungTotalPembayaran(double emasKawin, double harga) {
        return emasKawin * harga;
    }
}
