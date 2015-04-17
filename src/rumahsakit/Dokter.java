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
public class Dokter {
    
    private String id;
    private String nama;
    private Pasien pasien;
    
    void setPasien(Pasien pasien){
          this.pasien = pasien;
      }

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
     * @return the pasien
     */
    public Pasien getPasien() {
        return pasien;
    }
    
}
