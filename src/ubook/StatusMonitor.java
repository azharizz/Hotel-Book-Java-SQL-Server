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
public class StatusMonitor {
    private String idPesanan;
    private int total;
    private String status;
    private String idAdmin;
    private int noKtp;

    public StatusMonitor(String idPesanan, int total, String status, String idAdmin, int noKtp) {
        this.idPesanan = idPesanan;
        this.total = total;
        this.status = status;
        this.idAdmin = idAdmin;
        this.noKtp=noKtp;
    }

    public int getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(int noKtp) {
        this.noKtp = noKtp;
    }

    public String getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    
}
