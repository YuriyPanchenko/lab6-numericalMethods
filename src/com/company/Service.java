package com.company;

public class Service {
    public static double getFunctionValue(double x){
        if(x > 1)
        return 1/(x*Math.pow(Math.log(x), 2));
        else return 0;
    }

    public static double calculateSquareOfIntegralBySumOfRectangles(double a, double b, double e){
        double square = 0;
        double tmp = a;
        while (tmp<b){
            square += e*getFunctionValue(tmp);
            tmp+=e;
        }
        return square;
    }

    public static double calculateSquareOfIntegralBySumOfTrapeze(double a, double b, double e){
        double tmp = a+e;
        double leftSide = getFunctionValue(a);
        double rightSide;
        double square = 0;

        while (tmp<b){
            rightSide = getFunctionValue(tmp);
            square += e*(leftSide + (rightSide-leftSide)/2);
            tmp+= e;
            leftSide = rightSide;
        }
        return square;
    }

    public static double calculateSquareOfIntegralBySimpsonFormula(double a, double b, double e){
        double square = e*(getFunctionValue(a) + getFunctionValue(b));
        double tmp = a+e;
        int i = 1;
        while (tmp < b-e){
            if(i%2 == 1)
            square += e*getFunctionValue(tmp)*4;
            else square += e*getFunctionValue(tmp)*2;
            i++;
            tmp += e;
        }
        return  square/3;
    }
}
