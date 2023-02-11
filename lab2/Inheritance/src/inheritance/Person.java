/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author gt
 */
public class Person {
    String name;
    int age;
    String Address;
    String nationallity;

    public Person(String name, int age, String Address, String nationallity) {
        this.name = name;
        this.age = age;
        this.Address = Address;
        this.nationallity = nationallity;
    }

     public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getNationallity() {
        return nationallity;
    }

    public void setNationallity(String nationallity) {
        this.nationallity = nationallity;
    }
    
    
    public final void printAllDetails(){        // use final keyword to donnot allow for any one to take override from it
        System.out.println("name: " + name + "\n Age: " +age + "\n nationality: " + nationallity + "\n address: " + Address );
    }
    
}
