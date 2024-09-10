package com.inheritance;

class Name{
    public void printName() {
        System.out.println("My name is Mohammed Falih.");
    }
}

class Age extends Name{
    public void printAge(){
        System.out.println("I am 21 years old.");
    };
}

class HomeTown extends Age{
    public void printHome(){
        System.out.println("I am from Cumbum.");
    }
}

public class Multilevel{

   public static void main(String[] args) {
    HomeTown person = new HomeTown();
    
    person.printName();
    person.printAge();
    person.printHome();
   }
}
