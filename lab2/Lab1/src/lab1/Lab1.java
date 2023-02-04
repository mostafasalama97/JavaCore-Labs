/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;
import java.util.StringTokenizer;  

/**
 *
 * @author gt
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringTokenizer str;
        IP ipadress = new IP();
        str = ipadress.ipTokenizer("192.168.1.1");
        System.out.println(str.countTokens());
         while (str.hasMoreTokens()) {  
         System.out.println(str.nextToken());  
     }  
        
        // TODO code application logic here
//        IP ipadress = new IP();
//        System.out.println(ipadress);
//       String[] str = ipadress.ipSplit("192.168.1.1");
//       for(int i = 0 ; i< str.length ; i++){
//        System.out.println(str[i]);
//       }
    }
}
