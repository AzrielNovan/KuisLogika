/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mungkinkah;

/**
 *
 * @author AzrielNovan
 */
public class Mungkinkah {

    /**
     * @param args the command line arguments
     */
          static boolean a(int array[], int size, int K){
        for(int i = 0; i < (size - 1); i++){
            for(int j = (i + 1); j < size; j++){
                if(array[i] + array[j] == K){
                
                return true;
                }
            }
        }
        return false;
    }
    public static void main (String[]args){
        int array[] = {4,3,6,7,1};
        int K = 10;
        int size = array.length;
        System.out.println("array[] = {4,3,6,7,1};");
        System.out.println("K = 10");
        if(a(array, size, K)){
            System.out.println("BISA");
        }else{
            System.out.println("TIDAK BISA");
        }
    }
} 
