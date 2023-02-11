/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author gt
 */
public class HourlyEmployee extends Employee { //inheritance from sub class employee
    int wh; //working hour
    double hr;  //houre rate

    public HourlyEmployee(int wh, double hr, double salary, String rank, String jop, String name, int age, String Address, String nationallity) {
        super(salary, rank, jop, name, age, Address, nationallity);
        this.wh = wh;
        this.hr = hr;
    }

    public int getWh() {
        return wh;
    }

    public void setWh(int wh) {
        this.wh = wh;
    }

    public double getHr() {
        return hr;
    }

    public void setHr(double hr) {
        this.hr = hr;
    }
    
    
}
