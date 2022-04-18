/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apakahsemuaberbeda;

/**
 *
 * @author AzrielNovan
 */
public class Apakahsemuaberbeda {

    /**
     * @param args the command line arguments
     */

        static boolean a(int array[], int size, int K){
        for(int i = 0; i < (size - 1); i++){
            {
                if(array[i] == K){
                
                return true;
                }
            }
        }
        return false;
    }
    public static void main (String[]args){
        int array[] = {4,3,6,7,1};
        int K = 2;
        int size = array.length;
        System.out.println("array[] = {4,3,6,7,1};");
        System.out.println("K = 2");
        if(a(array, size, K)){
            System.out.println("BISA");
        }else{
            System.out.println("TIDAK BISA");
        }
    }
} 
