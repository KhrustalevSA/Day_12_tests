package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void sum() {                                            // Тесты работающих методов
        Calculator calculator = new Calculator();


        int sum = calculator.sum(5,5);

        assertEquals(5+5,sum);
    }

    @Test
    void sub() {
        Calculator calculator = new Calculator();

        int sub = calculator.sub(9,3);

        assertEquals(9-3,sub);
    }

    @Test
    void mul() {
        Calculator calculator = new Calculator();

        int mul = calculator.mul(2,2);

        assertEquals(2*2,mul);
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();

        int div = calculator.div(50,5);

        assertEquals(50/5,div);
    }
    @Test
    void div_on_null() {
        Calculator calculator = new Calculator();
        try {
            int div = calculator.div(50, 0);

            assertEquals(-1,div);

        } catch (ArithmeticException e){

        }
    }

    @Test
    void sum_error() {                                      // Тесты не работающих методов
        Calculator calculator = new Calculator();


        int sum = calculator.sum_error(5,5);

        assertEquals(5+5,sum);
    }

    @Test
    void sub_error() {
        Calculator calculator = new Calculator();

        int sub = calculator.sub_error(9,3);

        assertEquals(9-3,sub);
    }

    @Test
    void mul_error() {
        Calculator calculator = new Calculator();

        int mul = calculator.mul_error(2,2);

        assertEquals(2*2,mul);
    }

    @Test
    void div_error() {
        Calculator calculator = new Calculator();

        int div = calculator.div_error(50,5);

        assertEquals(50/5,div);
    }
}