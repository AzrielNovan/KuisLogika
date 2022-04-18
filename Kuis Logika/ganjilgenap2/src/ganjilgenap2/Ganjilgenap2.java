/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganjilgenap2;

/**
 *
 * @author AzrielNovan
 */
public class Ganjilgenap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] bil = {4, 6, 1, 3, 5};
        System.out.print("Genap  :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2 == 0) {
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Ganjil :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2!= 0){
                System.out.print(bil[i] + " ");
            }
        }      
        System.out.println("");
    }
}