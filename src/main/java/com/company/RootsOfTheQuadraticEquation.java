package com.company;

import java.util.Arrays;

public class RootsOfTheQuadraticEquation {
    private double root1;
    private double root2;

    public double[] countingRoots(double a, double b, double c){
        double D = b*b - 4 * a * c;
        double arr[] = new double[2];
        if (D > 0){
            root1 = (-b + Math.sqrt(D))/(2*a);
            root2 = (-b - Math.sqrt(D))/(2*a);
            arr[0] = root1;
            arr[1] = root2;
        }
        if (D == 0){
            root1 = (-b + Math.sqrt(D))/(2*a);
            arr[0] = root1;
        }

        return arr;
    }

    public double getRoot1() {
        return root1;
    }

    public double getRoot2() {
        return root2;
    }
}
