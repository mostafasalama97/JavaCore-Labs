/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3.pkg1;

/**
 *
 * @author gt
 */
public class TempConvert implements  Fahrenheit_Interface  {
    public float convert(float celsius){
        float fahren;
        fahren =(float) ((9.0/5.0) * celsius + 32);
        return fahren;
    }
}
