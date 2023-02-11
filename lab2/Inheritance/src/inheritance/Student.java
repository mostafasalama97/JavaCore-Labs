/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author gt
 */
public class Student extends Person {   //inheritance from main class person 
    String study_level;
    String specialization;
    double gpa;

    public Student(String study_level, String specialization, double gpa, String name, int age, String Address, String nationallity) {
        super(name, age, Address, nationallity);
        this.study_level = study_level;
        this.specialization = specialization;
        this.gpa = gpa;
    }

    public String getStudy_level() {
        return study_level;
    }

    public void setStudy_level(String study_level) {
        this.study_level = study_level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
}
