/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganjilgenap;
import java.util.Scanner;
/**
 *
 * @author AzrielNovan
 */
public class Ganjilgenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
        int bilangan;
        System.out.print("Silahkan memasukkan bilangan = ");
        bilangan=input.nextInt();
        
        if (bilangan%2==0){
            System.out.println("Bilangan "+bilangan+" adalah genap");
        }else {
             System.out.println("Bilangan "+bilangan+" adalah ganjil");
        }
    
  }
}
