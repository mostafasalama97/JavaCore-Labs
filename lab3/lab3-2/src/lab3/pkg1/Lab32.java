/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3.pkg1;

/**
 *
 * @author gt
 */
public class Lab32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float temp = 35;
        float ctemp;
        TempConvert fi1 = new TempConvert(){
            @Override
            public float convert(float celsius){
        float fahren;
        fahren =(float) ((9.0/5.0) * celsius + 32);
        return fahren;
    }
        };
        System.out.println("temperature in Fahrenheit = " + fi1.convert(temp));
    }
    
}
