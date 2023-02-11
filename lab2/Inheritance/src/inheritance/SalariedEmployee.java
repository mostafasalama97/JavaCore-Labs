/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author gt
 */
public class SalariedEmployee extends Employee {    //inheritance from sub class employee
    double bonus;
    double deduction;

    public double getBonus() {
        return bonus;
    }

    public SalariedEmployee(double bonus, double deduction, double salary, String rank, String jop, String name, int age, String Address, String nationallity) {
        super(salary, rank, jop, name, age, Address, nationallity);
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }
    @Override   //getsalary here it is override for method getsalary in base class
     public double getSalary() {
        return salary + bonus - deduction;
    }
}
