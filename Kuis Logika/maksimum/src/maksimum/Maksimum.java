/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maksimum;

import java.util.Scanner;

/**
 *
 * @author AzrielNovan
 */
public class Maksimum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = { 3, 4, 6, 9 };
        System.out.println("max value");
        int max=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max){
                max = a[i];
            }
        }
        System.out.println("nilai max = "+max);
    }
}
