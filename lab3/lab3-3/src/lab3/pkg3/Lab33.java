/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3.pkg3;
import static java.lang.Math.*;
/**
 *
 * @author gt
 */
public class Lab33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1, b = 5, c = 2;      

        EquationInterface obj = new QuadricEquation();
        
        obj.calculateRoots(a, b, c);
    }
    
}
