/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author gt
 */
public abstract class Employee extends Person {  //here i do inheritance
    double salary;
    String rank;
    String jop;

    public Employee(double salary, String rank, String jop, String name, int age, String Address, String nationallity) {
        super(name, age, Address, nationallity);
        this.salary = salary;
        this.rank = rank;
        this.jop = jop;
    }
// create abstract method 
//    public abstract double getSalary();       // force any one will inherit from employee class to provide his self implementation for this method
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getJop() {
        return jop;
    }

    public void setJop(String jop) {
        this.jop = jop;
    }
    
//    @Override
//    public void printAllDetails(){
////        System.out.println("name: " + name + "\n Age: " +age + "\n nationality: " + nationallity + "\n address: " + Address + "\n salar: " + salary + "\n rank: " + rank + "\n jop: " + jop);
//    //another way for override which accepte for reusability principal
//    super.printAllDetails();
//    System.out.println("salar: " + salary + "\n rank: " + rank + "\n jop: " + jop);
//    
//    
//    }
}
 