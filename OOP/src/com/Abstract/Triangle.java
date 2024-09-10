package com.Abstract;

public class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h){
        base = b;
        height = h;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

}
