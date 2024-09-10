package com.multithreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDemo {
    public static void main(String[] args) throws Exception {
        Save obj = new Save();
        obj.i = 1090;

        File file = new File("serial.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.close();

        FileInputStream fis = new FileInputStream("serial.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj1 = (Save) ois.readObject();
        ois.close();

        System.out.println("The value of object: " + obj1.i);
    }   
}

class Save implements Serializable{
    int i;
}
