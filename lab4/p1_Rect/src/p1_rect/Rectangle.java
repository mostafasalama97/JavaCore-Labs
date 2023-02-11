/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1_rect;

/**
 *
 * @author gt
 */
public class Rectangle {
    
    private double width;
    private double length;
    
    
    Rectangle(){
        length = 10;
        width = 15;
    }
    
    Rectangle(double w , double l){
        width = w;
        length = l;
    }

//    Rectangle(double d) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0){
        this.width = width;
        }else{
            System.out.println("enter valid width");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length > 0){
        this.length = length;
    }else{
            System.out.println("enter valid length");
        }
    }
    
    public double getArea(){
        return length * width;
    }

    double nextDouble() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public boolean isEqual(Rectangle obj2){
        if (this.length == obj2.length && this.width == obj2.width){
            return true;
        } else return false;
    }
    
}
