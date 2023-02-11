/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author gt
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student st1 = new Student("prep", "engineer", 3.5, "mostafa", 25, "alexandria", "egyptian");
        System.out.println(st1.getNationallity());
        System.out.println("==========================");
        SalariedEmployee se1;
        se1 = new SalariedEmployee(500, 200, 1000,"a" , "eng", "hmada", 25, "kambala", "manfokia");
        System.out.println(se1.getSalary());
                System.out.println("==========================");
//                Employee emp1 = new Employee();      //cannot create object becouse employee is abstract class
        Person p1 = new Person("m3za", 3 , "elmaree5", "alians");
        p1.printAllDetails();
                System.out.println("==========================");
            se1.printAllDetails();
//        System.out.println(p1.printAllDetails());
    }
    
    
}
