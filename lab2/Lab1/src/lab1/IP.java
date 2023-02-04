

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.util.StringTokenizer;  


/**
 *
 * @author gt
 */
public class IP {

    
//   private String[] mac;
//String[] arr;
   public static StringTokenizer ipTokenizer(String ip){
      StringTokenizer arr = new StringTokenizer(ip,"\\."); 
      System.out.println(arr);
      return arr;
   }
   // using split method 
//   public String[] ipSplit(String ip){
//       this.mac = ip.split("\\.");
//       return this.mac;
//   }
   
   // using string tokenizer
   
}