/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsipengembaliannilai;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class FungsiPengembalianNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        int a, b, c;
        System.out.println("Program Menjumlahkan 2 Nilai");
        System.out.print("Masukkan Nilai a : ");
        a = masukan.nextInt();
        System.out.print("Masukkan Nilai b : ");
        b = masukan.nextInt();
        System.out.print("Masukkan Nilai c : ");
        c = masukan.nextInt();
        System.out.println();
        System.out.println("Jumlah a + b : "+(jumlah(a,b)));
        System.out.println("Jumlah b + c : "+(jumlah(b,c)));
        System.out.println("Jumlah a + c : "+(jumlah(a,c)));
        }
    // Konstruktor
    private static int jumlah (int a, int b){
        // Menghitung Hasil dari Ke 2 Nilai
        int hasil = a + b;
        return hasil;
    }
    
}
