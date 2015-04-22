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
        info1.setKode("Info Pasien - 001");
        info1.setDokter(dokter1);
        info1.setPasien(pasien1);
        info1.setPerawat(perawat1);
        info1.setRuang(ruang1);
        info1.setObat(obat1);
        info1.setWaktuInap(new Date());
        
        dokter1.setPasien(pasien1);
        
        InfoDokter info2 = new InfoDokter();
        info2.setKode("Info Dokter - 001");
        info2.setDokter(dokter1);
        info2.setPasien(pasien1);
        info2.setWaktuKerja(new Date());
    
        CetakInfoPasien(info1);
        System.out.println();
        CetakInfoDokter(info2);
    }
    
    static void CetakInfoPasien(InfoPasien pasien){
        System.out.println("kode - "+pasien.getKode());
        
        System.out.println("Pasien\t: "+pasien.getPasien().getId()+" - "+pasien.getPasien().getNama()
                +"\nDokter\t: "+pasien.getDokter().getId()+" - "+pasien.getDokter().getNama()
                +"\nPerawat\t: "+pasien.getPerawat().getId()+" - "+pasien.getPerawat().getNama()
                +"\nSakit\t: "+pasien.getPasien().getPenyakit()
                +"\nRuangan\t: "+pasien.getRuang().getRuang()+"-"+pasien.getRuang().getKasur()
                +"\nObat\t: "+pasien.getObat().getId()+" - "+pasien.getObat().getNamaObat()+" - "+pasien.getObat().getMerk()
                +"\nInap\t: "+pasien.getWaktuInap()
        );
    }
    
    static void CetakInfoDokter(InfoDokter dokter){
        System.out.println("kode - "+dokter.getKode());
        
        System.out.println("Nama\t: "+dokter.getDokter().getNama()
                +"\nID\t: "+dokter.getDokter().getId()
                +"\nPasien\t: "+dokter.getPasien().getNama()
                +"\nKerja\t: "+dokter.getWaktuKerja()
        );
    }
    
}
