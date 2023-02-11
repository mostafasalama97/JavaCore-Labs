/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3.pkg1;

/**
 *
 * @author gt
 */
public class Lab31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float temp = 35;
        Fahrenheit_Interface fi1 = new TempConvert();
        System.out.println("temperature in Fahrenheit = " + fi1.convert(temp));
    }
    
}
