package com.company;

public class Main {

    public static void main(String[] args) {
        double square1 = Service.calculateSquareOfIntegralBySumOfRectangles(2, 10, 1e-3);
        double square2 = Service.calculateSquareOfIntegralBySumOfTrapeze(2, 10, 1e-3);
        double square3 = Service.calculateSquareOfIntegralBySimpsonFormula(2, 10, 1e-3);
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);
    }
}
