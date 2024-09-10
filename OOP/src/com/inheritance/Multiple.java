package com.inheritance;

interface One {
    public void printGeek();
}

interface Two{
    public void printFor();
}

interface Three extends One, Two{
    public void printGeek();
}

class Child implements Three{

    @Override
    public void printFor() {
        System.out.println("for");
    }

    @Override
    public void printGeek() {
        System.out.println("Geeks");
    }

}

public class Multiple{
    public static void main(String[] args) {
        Child child1 = new Child();

        child1.printGeek();
        child1.printFor();
        child1.printGeek();
    }
}
