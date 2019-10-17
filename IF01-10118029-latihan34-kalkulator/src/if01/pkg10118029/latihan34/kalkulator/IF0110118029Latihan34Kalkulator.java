/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan kalkulator
 * 
 */
public class IF0110118029Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        kalkulator kalkulator = new kalkulator();
        
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan Angka ke-1 : ");
        kalkulator.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = scanner.nextDouble();
        
        System.out.println("Hasil Pertambahan : " +kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " +kalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian   : " +kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian   : " +kalkulator.bagiBilangan());
        System.out.println("Hasil Sisa        : " +kalkulator.sisaBilangan());
    }
    
}
