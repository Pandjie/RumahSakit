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
public class InfoPasien {
    
    private String kode;
    private Dokter dokter;
    private Pasien pasien;
    private Perawat perawat;
    private Ruangan ruang;
    private Obat obat;
    private Date waktuInap;

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
     * @return the perawat
     */
    public Perawat getPerawat() {
        return perawat;
    }

    /**
     * @param perawat the perawat to set
     */
    public void setPerawat(Perawat perawat) {
        this.perawat = perawat;
    }

    /**
     * @return the ruang
     */
    public Ruangan getRuang() {
        return ruang;
    }

    /**
     * @param ruang the ruang to set
     */
    public void setRuang(Ruangan ruang) {
        this.ruang = ruang;
    }

    /**
     * @return the obat
     */
    public Obat getObat() {
        return obat;
    }

    /**
     * @param obat the obat to set
     */
    public void setObat(Obat obat) {
        this.obat = obat;
    }

    /**
     * @return the waktuInap
     */
    public Date getWaktuInap() {
        return waktuInap;
    }

    /**
     * @param waktuInap the waktuInap to set
     */
    public void setWaktuInap(Date waktuInap) {
        this.waktuInap = waktuInap;
    }
}
