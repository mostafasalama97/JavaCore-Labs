/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.pkg2;

/**
 *
 * @author gt
 */
public class Occurence {
    static int countOccurrences(String str, String word)
{
    String arr[] = str.split(" ");
    int count = 0;
    for (int i = 0; i < arr.length; i++)
    {
    if (word.equals(arr[i]))
        count++;
    }
 
    return count;
}
    
}
