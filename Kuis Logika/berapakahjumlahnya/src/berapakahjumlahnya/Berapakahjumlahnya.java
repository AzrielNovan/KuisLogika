/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berapakahjumlahnya;
import java.util.Scanner;

/**
 *
 * @author AzrielNovan
 */
public class Berapakahjumlahnya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("1 + N = ?");
        int bilangan;
        System.out.print("Silahkan memasukkan bilangan = ");
        bilangan=input.nextInt();
        System.out.println("----------------------------");
        System.out.println("Total penjumlahan 1 + N adalah "+(1+bilangan) );
    }
    
}
