package com.exception_handling;

class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}

public class UserDefined {
    public static void main(String[] args) {
        try {
            throw new MyException("Error by falih");
        } catch(MyException ex) {
            System.out.println("Error caught in catch block");
            System.out.println("Caught Error: " + ex.getMessage());
        }
    }
}
