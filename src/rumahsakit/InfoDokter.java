/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahsakit;

import java.util.Date;

/**
 *
 * @author Dikpora
 */
public class InfoDokter {
    
    private String kode;
    private Dokter dokter;
    private Pasien pasien;
    private Date waktuKerja;

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @return the dokter
     */
    public Dokter getDokter() {
        return dokter;
    }

    /**
     * @param dokter the dokter to set
     */
    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    /**
     * @return the pasien
     */
    public Pasien getPasien() {
        return pasien;
    }

    /**
     * @param pasien the pasien to set
     */
    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    /**
     * @return the waktuKerja
     */
    public Date getWaktuKerja() {
        return waktuKerja;
    }

    /**
     * @param waktuKerja the waktuKerja to set
     */
    public void setWaktuKerja(Date waktuKerja) {
        this.waktuKerja = waktuKerja;
    }
}
