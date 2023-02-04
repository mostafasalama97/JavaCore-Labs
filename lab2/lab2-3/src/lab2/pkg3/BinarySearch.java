/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.pkg3;

/**
 *
 * @author gt
 */
public class BinarySearch {
    
    public int max (int[] arr){
        
        int max= 0;
        for(int i = 0 ; i < arr.length ; i++){
        if (arr[i] > max){
            max = arr[i];
        }
    }
        return max;
    }
     public int min (int[] arr){
        
        int min= arr[0];
        for(int i = 0 ; i < arr.length ; i++){
        if (arr[i] < min){
            min = arr[i];
        }
    }
        return min;
    }
    
}
