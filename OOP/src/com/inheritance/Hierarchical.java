package com.inheritance;

class A{
    public void printA(){
        System.out.println("Class A");
    }
}
class B extends A{
    public void printB(){
        System.out.println("Class B");
    }
}
class C extends A{
    public void printC(){
        System.out.println("Class C");
    }
}
class D extends A{
    public void printD(){
        System.out.println("Class D");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        B objB = new B();
        C objC = new C();
        D objD = new D();

        System.out.println("\nHierarchical Inheritance");

        objB.printA();
        objB.printB();

        objC.printA();
        objC.printC();

        objD.printA();
        objD.printD();
    }
}
