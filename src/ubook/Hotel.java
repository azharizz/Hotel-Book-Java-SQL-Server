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
public class Hotel {
    
    private String id;
    private String nama;
    private int harga;
    private int kuota;
    private String email;
    private byte[] gambar;
    private String deskripsi;
    private int noRek;
    private String alamat;

    public Hotel(String id, String nama, int harga, int kuota, String email, byte[] gambar, String deskripsi, int noRek,String alamat) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.kuota = kuota;
        this.email = email;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
        this.noRek = noRek;
        this.alamat=alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getNoRek() {
        return noRek;
    }

    public void setNoRek(int noRek) {
        this.noRek = noRek;
    }

}
