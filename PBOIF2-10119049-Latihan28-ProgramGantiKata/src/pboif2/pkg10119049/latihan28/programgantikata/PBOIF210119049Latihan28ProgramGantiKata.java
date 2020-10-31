/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan28.programgantikata;

import java.util.Scanner;

/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : program untuk mengganti kata
 */
public class PBOIF210119049Latihan28ProgramGantiKata {
    public static Scanner scan = new Scanner(System.in);
    public static String kalimat;
    public static String gantiKata;
    public static String kataGanti;
    
    public static void setKalimat(){
        System.out.print("Masukkan Kalimat : "); kalimat = scan.nextLine();
        System.out.print("Ganti Kata : "); gantiKata = scan.nextLine();
        System.out.print("Menjadi Kata : "); kataGanti = scan.nextLine();
    }
    
    public static String gantiKalimat(){
        return kalimat.replace(gantiKata, kataGanti);
    }
    
    public static void getTampilData(){
        String kalimatBaru;
        
        setKalimat();
        kalimatBaru = gantiKalimat();
        
        System.out.println("=====Hasil Formatting=====");
        System.out.printf("Kalimat awal : %s%n", kalimat);
        System.out.printf("Kalimat awal : %s%n", kalimatBaru);
    }
    
    public static void main(String[] args) {
        getTampilData();
    }
    
}
