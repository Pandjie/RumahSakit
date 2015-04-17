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
public class RumahSakit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dokter dokter1 = new Dokter();
        dokter1.setId("A5B007");
        dokter1.setNama("Dr. Manggala");
        
        Pasien pasien1 = new Pasien();
        pasien1.setId("A001");
        pasien1.setNama("Surya D");
        pasien1.setPenyakit("Demam");
        
        Perawat perawat1 = new Perawat();
        perawat1.setId("C9D005");
        perawat1.setNama("Ikasakti");
        
        Ruangan ruang1 = new Ruangan();
        ruang1.setRuang("409");
        ruang1.setKasur("A");
        
        Obat obat1 = new Obat();
        obat1.setId("XYZ007");
        obat1.setNamaObat("APTX");
        obat1.setMerk("RareMec");
        
        pasien1.setDokter(dokter1);
        pasien1.setRuang(ruang1);
        pasien1.setKasur(ruang1);
        pasien1.setObat(obat1);
        
        InfoPasien info1 = new InfoPasien();
        info1.kode = "Info Pasien - 001";
        info1.dokter = dokter1;
        info1.pasien = pasien1;
        info1.perawat = perawat1;
        info1.ruang = ruang1;
        info1.obat = obat1;
        info1.waktuInap = new Date();
        
        dokter1.setPasien(pasien1);
        
        InfoDokter info2 = new InfoDokter();
        info2.kode = "Info Dokter - 001";
        info2.dokter = dokter1;
        info2.pasien = pasien1;
        info2.waktuKerja = new Date();
    
        CetakInfoPasien(info1);
        System.out.println();
        CetakInfoDokter(info2);
    }
    
    static void CetakInfoPasien(InfoPasien pasien){
        System.out.println("kode - "+pasien.kode);
        
        System.out.println("Pasien\t: "+pasien.pasien.getId()+" - "+pasien.pasien.getNama()
                +"\nDokter\t: "+pasien.dokter.getId()+" - "+pasien.dokter.getNama()
                +"\nPerawat\t: "+pasien.perawat.getId()+" - "+pasien.perawat.getNama()
                +"\nSakit\t: "+pasien.pasien.getPenyakit()
                +"\nRuangan\t: "+pasien.ruang.getRuang()+"-"+pasien.ruang.getKasur()
                +"\nObat\t: "+pasien.obat.getId()+" - "+pasien.obat.getNamaObat()+" - "+pasien.obat.getMerk()
                +"\nInap\t: "+pasien.waktuInap
        );
    }
    
    static void CetakInfoDokter(InfoDokter dokter){
        System.out.println("kode - "+dokter.kode);
        
        System.out.println("Nama\t: "+dokter.dokter.getNama()
                +"\nID\t: "+dokter.dokter.getId()
                +"\nPasien\t: "+dokter.pasien.getNama()
                +"\nKerja\t: "+dokter.waktuKerja
        );
    }
    
}
