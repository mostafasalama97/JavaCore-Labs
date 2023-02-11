/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionhandling;

import static exceptionhandling.Exception_Class1.method;
import static exceptionhandling.Exception_Class1.namemethod;
import static exceptionhandling.Exception_Class1.val;

/**
 *
 * @author gt
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try  
        {  
            // calling the method   
            val(20);
            namemethod("mostafa");
            method("egypt");
        }  
        catch (OWnExceptionClass ex)  
        {  
            System.out.println("Caught the exception");  
    
            // printing the message from InvalidAgeException object  
            System.out.println("Exception occured: " + ex);  
        }  
  
        System.out.println("rest of the code...");    
    }  

    
}  
  
