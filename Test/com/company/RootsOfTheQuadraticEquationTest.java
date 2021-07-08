package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RootsOfTheQuadraticEquationTest {

    @Test
    void countingRootsD1() {
        RootsOfTheQuadraticEquation rootCounting = new RootsOfTheQuadraticEquation();

        double[] arr = rootCounting.countingRoots(1,3,-4);             // Если Дискриминант больше нуля
        double[] arr_need = new double[]{1,-4};

        assertArrayEquals(arr_need,arr);
    }

    @Test
    void countingRootsD2() {
        RootsOfTheQuadraticEquation rootCounting = new RootsOfTheQuadraticEquation();

        double[] arr =  rootCounting.countingRoots(1,-4,4);             // Если дискриминант равен нулю
        double[] arr_need = new double[]{2,0};

        assertArrayEquals(arr_need,arr);
    }

    @Test
    void countingRootsD3() {
        RootsOfTheQuadraticEquation rootCounting = new RootsOfTheQuadraticEquation();

        double[] arr = rootCounting.countingRoots(1,-5,9);             // Если дискриминант меньше нуля
        double[] arr_need = new double[]{0,0};
        assertArrayEquals(arr_need,arr);
    }

}