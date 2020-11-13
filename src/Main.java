/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program ini berisi perhitungan Massa jenis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus1 = new Kubus();
        kubus1.setSisi(5);
        kubus1.setMassa(250);
        
        System.out.println("======Massa Jenis Kubus=======");
        System.out.println("Sisi\t: " + kubus1.getSisi());
        System.out.println("Massa\t: " + kubus1.getMassa());
        
        System.out.println();
        
        System.out.println("\n======Hasil Perhitungan=====");
        System.out.println("Volume\t: " + kubus1.hitungVolume(kubus1.getSisi()));
        System.out.println("Massa Jenis : " + kubus1.hitungMassaJenis(kubus1.getMassa(), kubus1.getSisi()));
    }
    
}
