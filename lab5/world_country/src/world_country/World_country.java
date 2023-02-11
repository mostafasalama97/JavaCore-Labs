/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package world_country;
import java.io.*;  
import java.util.Scanner;  
/**
 *
 * @author gt
 */
public class World_country {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
//        // TODO code application logic here
        //parsing a CSV file into Scanner class constructor  
Scanner cit = new Scanner(new File("F:\\javacore\\labs\\lab3\\Cities.csv"));  
cit.useDelimiter(",");   //sets the delimiter pattern  
while (cit.hasNext())  //returns a boolean value  
{  
System.out.print(cit.next());  //find and returns the next complete token from this scanner  
}   
cit.close();  //closes the scanner  
//---------------------------------------------------------------------
//Scanner con = new Scanner(new File("F:\\javacore\\labs\\lab3\\Countries.csv"));  
//con.useDelimiter(",");   //sets the delimiter pattern  
//while (con.hasNext())  //returns a boolean value  
//{  
//System.out.print(con.next());  //find and returns the next complete token from this scanner  
//}   
//con.close();  //closes the scanner  
////}  
}  
}
    
