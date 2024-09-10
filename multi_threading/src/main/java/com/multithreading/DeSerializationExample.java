package com.multithreading;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationExample {
    public static void main(String[] args) {
        Person person = null;

        try(FileInputStream fis = new FileInputStream("serialize.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)){
                person = (Person) ois.readObject();
            } catch(Exception e){
                e.getStackTrace();
            }

            System.out.println(person);
    }
}
