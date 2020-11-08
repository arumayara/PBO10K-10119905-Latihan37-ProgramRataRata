/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan37.ProgramRataRata;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program Rata-rata Nilai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        KalkulatorRataRata kRataRata = new KalkulatorRataRata();
        
        System.out.println("Masukan banyaknya mahasiswa : ");
        kRataRata.mahasiswa =scanner.nextInt();
        kRataRata.jumlah = 0;
        var i=1;
        
        while(i<=kRataRata.mahasiswa){
            System.out.println("Mahasiswa ke -"+i+" : ");
            kRataRata.nilai= scanner.nextInt();
            kRataRata.jumlah +=kRataRata.nilai;
            i++;    
        }
        kRataRata.hitungRataRata();
        System.out.println();
        System.out.println("Maka, Rata-rata nilainya adalah "+ kRataRata.ratarata);
        System.out.println("Developed by : Abraham Rumayara");
    }
    
}
