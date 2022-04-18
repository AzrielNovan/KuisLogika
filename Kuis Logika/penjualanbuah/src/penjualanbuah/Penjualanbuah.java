/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanbuah;

import java.util.Scanner;

/**
 *
 * @author AzrielNovan
 */
public class Penjualanbuah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int maksimum, jumlah, i, lokasi = 1, array[];
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jumlah barang : ");
    jumlah = scan.nextInt();
    array = new int[jumlah];
    
    System.out.println("Masukkan "+jumlah+" angka dalam bentuk kg");
    for(i = 0; i < jumlah; i++) {
      System.out.print("Barang ke-"+ (i+1) +": " );
      array[i] = scan.nextInt();
    }
    maksimum = array[0];
    for(i = 0; i < jumlah; i++) {
      if (array[i] > maksimum){
        maksimum = array[i];
        lokasi = i+1;
      }
    }
    System.out.println("makasimum "+maksimum+" ada di barang ke "+lokasi);
    
  }
}
