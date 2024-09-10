package com.Abstract;

public class Square extends Shape {
    double side;

    Square(double side){
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

}
