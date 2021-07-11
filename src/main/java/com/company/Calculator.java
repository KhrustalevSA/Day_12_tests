package com.company;

public class Calculator {

    public int sum(int num1, int num2){                 // Работающие методы калькулятора
        int sum = num1 + num2;
        return sum;
    }
    public int sub(int num1, int num2){
        int sub = num1 - num2;
        return sub;
    }
    public int mul(int num1, int num2){
        int mul = num1 * num2;
        return mul;
    }
    public int div(int num1, int num2){
        if (num2 == 0){
            throw new ArithmeticException();
        } else {
            int div = num1 / num2;
            return div;
        }
    }

}
