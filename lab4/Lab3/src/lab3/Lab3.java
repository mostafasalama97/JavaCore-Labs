/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

/**
 *
 * @author gt
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       DoubleComplex No1 = new DoubleComplex(5, 2);
        DoubleComplex No2 = new DoubleComplex(7, 3);
        System.out.println(No1.add(No2));
        System.out.println(No1.sub(No2));
        System.out.println(No1.mul(No2));
        System.out.println(No1.div(No2));
    }
    
}
