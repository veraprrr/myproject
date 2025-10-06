package org.example;

public class Calc {
    public int summ(int a, int b){
        int resultSum;
        resultSum = a + b;
        //System.out.println("Сумма " + a + " и " + b + " равна " + result);
        System.out.printf("Сумма %d и %d равна %d\n", a, b, resultSum);
        return resultSum;
    }

    public int diff(int c, int d){
        int resultDiff;
        resultDiff = c - d;
        System.out.printf("Разность %d и %d равна %d\n", c, d, resultDiff);
        return resultDiff;
    }
}
