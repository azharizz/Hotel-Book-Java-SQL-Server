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
public class GuestBook {
    private int noKtp;
    private String namaCus;
    private String jenis;
    private String checkIn;
    private String checkOut;
    private String idAdmin;

    public GuestBook(int noKtp, String namaCus, String jenis, String checkIn, String checkOut, String idAdmin) {
        this.noKtp = noKtp;
        this.namaCus = namaCus;
        this.jenis = jenis;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.idAdmin = idAdmin;
    }

    public int getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(int noKtp) {
        this.noKtp = noKtp;
    }

    public String getNamaCus() {
        return namaCus;
    }

    public void setNamaCus(String namaCus) {
        this.namaCus = namaCus;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
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

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    
}
