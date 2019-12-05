/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubook;

/**
 *
 * @author AZHAR
 */
public class Kamar {
    private int noKamar;
    private String jenis;
    private int harga;
    private int kuota;
    private String idHotel;
    private String fasilitas;

    public Kamar(int noKamar, String jenis, int harga, int kuota, String idHotel, String fasilitas) {
        this.noKamar = noKamar;
        this.jenis = jenis;
        this.harga = harga;
        this.kuota = kuota;
        this.idHotel = idHotel;
        this.fasilitas = fasilitas;
    }

    public int getNoKamar() {
        return noKamar;
    }

    public void setNoKamar(int noKamar) {
        this.noKamar = noKamar;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getKuota() {
        return kuota;
    }

    public void setKuota(int kuota) {
        this.kuota = kuota;
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }
    
    
    
}
