/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author gt
 */
public class DoubleComplex implements Complex<Double> {

    public DoubleComplex(int par, int par1) {
    }

    private Double real;
    private Double imaginary;

    @Override
    public Double getReal() {
        return real;
    }

    @Override
    public Double getImagine() {
        return imaginary;
    }

    @Override
    public Complex<Double> add(Complex<Double> z) {
        System.out.println("add");
        return null;
    }

    @Override
    public Complex<Double> sub(Complex<Double> z) {
        System.out.println("sub");
        return null;
    }

    @Override
    public Complex<Double> mul(Complex<Double> z) {
        System.out.println("mul");
        return null;
    }

    @Override
    public Complex<Double> div(Complex<Double> z) {
        System.out.println("div");
        return null;
    }

}
