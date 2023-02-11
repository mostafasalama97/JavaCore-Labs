/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;

/**
 *
 * @author gt
 */
public class Exception_Class1 {
    String nationality = "egypt";
    public static void val(int age) throws OWnExceptionClass{    
       if(age < 18){  
  
        // throw an object of user defined exception  
        throw new OWnExceptionClass("your age under allowed age");    
    }  
       else {   
        System.out.println("your age over allowed");   
        }   
     }  
    
    
     public static void namemethod(String name) throws OWnExceptionClass{
        if("mosstafa".equals(name)){
            System.out.println("your age over allowed");
        }
        else {
            throw new OWnExceptionClass("bad name"); 
        }
    }
    
    
     public static void method(String nationality) throws OWnExceptionClass{
         if("egypt".equals(nationality)){
            System.out.println("you are egyptian");
        }
        else {
            throw new OWnExceptionClass("bad country"); 
        }
    
    }
}