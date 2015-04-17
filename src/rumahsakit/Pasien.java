/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahsakit;

/**
 *
 * @author Dikpora
 */
public class Pasien {
 
    private String id;
    private String nama;
    private String penyakit;
    private Dokter dokter;
    private Ruangan ruang;
    private Ruangan kasur;
    private Obat obat;
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        
        this.nama = nama;
    }

    /**
     * @return the penyakit
     */
    public String getPenyakit() {
        return penyakit;
    }

    /**
     * @param penyakit the penyakit to set
     */
    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
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
     * @return the kasur
     */
    public Ruangan getKasur() {
        return kasur;
    }

    /**
     * @param kasur the kasur to set
     */
    public void setKasur(Ruangan kasur) {
        this.kasur = kasur;
    }
    
    
}
