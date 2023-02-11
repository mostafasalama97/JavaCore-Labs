/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab3;

/**
 *
 * @author gt
 */
public interface Complex<T> {
    T getReal();
    T getImagine();
    
    Complex<T> add(Complex<T> z);
    Complex<T> sub(Complex<T> z);
    Complex<T> mul(Complex<T> z);
    Complex<T> div(Complex<T> z);
}
