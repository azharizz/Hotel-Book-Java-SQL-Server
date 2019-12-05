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
public class Cart {
//     String query3 = "insert into KERANJANG(ID_PESANAN, NAMA_HOTEL, ID_HOTEL, GAMBAR, HARGA_HOTEL, STATUS_TRANSAKSI, TGLCHECKIN, TGLCHECKOUT, JENIS_KAMAR, NO_KAMAR,TOTAL_TAGIHAN,NO_KTP) "
//                    + "values(?,?,?,null,?,?,?,?,?,?,?,?)";
     private String idPesanan;
     private String nama;
     private String idHotel;
     private byte[] gambar;
     private int hargaHotel;
     private String status;
     private String checkIn;
     private String checkOut;
     private String jenis;
     private int noKamar;
     private int total;
     private int noKtp;
     private String alamat;

    public Cart(String idPesanan, String nama, String idHotel, byte[] gambar, int hargaHotel, String status, String checkIn, String checkOut, String jenis, int noKamar, int total, int noKtp, String alamat) {
        this.idPesanan = idPesanan;
        this.nama = nama;
        this.idHotel = idHotel;
        this.gambar = gambar;
        this.hargaHotel = hargaHotel;
        this.status = status;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.jenis = jenis;
        this.noKamar = noKamar;
        this.total = total;
        this.noKtp = noKtp;
        this.alamat = alamat;
    }

    public String getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
    }

    public int getHargaHotel() {
        return hargaHotel;
    }

    public void setHargaHotel(int hargaHotel) {
        this.hargaHotel = hargaHotel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getNoKamar() {
        return noKamar;
    }

    public void setNoKamar(int noKamar) {
        this.noKamar = noKamar;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(int noKtp) {
        this.noKtp = noKtp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
     
     
}
