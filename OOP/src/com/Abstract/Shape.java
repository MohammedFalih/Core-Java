package com.Abstract;

abstract class Shape {
    abstract double area();
}

class Abstract{
    public static void main(String[] args) {
        Square sq = new Square(12);
        System.out.println("Area of square: " + sq.area());

        Triangle triangle = new Triangle(10, 5);
        System.out.println("Area of traingle: "+ triangle.area());

        Shape[] shapes = new Shape[4];
        shapes[0] = new Square(6);
        shapes[1] = new Square(8);
        shapes[2] = new Triangle(12.0, 6.0);
        shapes[3] = new Triangle(20.0, 10.0);
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}