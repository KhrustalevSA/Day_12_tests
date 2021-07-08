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


    public int sum_error(int num1, int num2){           // Не работающие методы калькулятора
        int sum_error = num1 * num2;
        return sum_error;
    }
    public int sub_error(int num1, int num2){
        int sub_error = num1 + num2;
        return sub_error;
    }
    public int mul_error(int num1, int num2){
        int mul_error = num1 * num2;
        return mul_error*2;
    }
    public int div_error(int num1, int num2){
        int div_error = num1 / num2 * 2;
        return div_error;
    }
}
