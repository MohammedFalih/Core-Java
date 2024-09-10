package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class DeSerialixation {
    public static void main(String[] args) {
        User user =  null;

        try(FileInputStream fileIn = new FileInputStream("brocode.ser");
            ObjectInputStream out = new ObjectInputStream(fileIn);
        ) {
            user = (User) out.readObject();
        } catch (Exception e) {
            e.getMessage();
        }

        System.out.println("name: " + user.name);
        System.out.println("password: " + user.password);  // null because it is transient
        user.sayHello();
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("SerialVersionUID: " + serialVersionUID);
    }
}
