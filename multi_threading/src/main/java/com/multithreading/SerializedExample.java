package com.multithreading;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class SerializedExample {
    public static void main(String[] args) {
        Person person1 = new Person("Falih", 21);

        try(FileOutputStream fos = new FileOutputStream("serialize.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);){
            oos.writeObject(person1);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
