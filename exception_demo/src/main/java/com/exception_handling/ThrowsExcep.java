package com.exception_handling;

public class ThrowsExcep {
    
    static void fun() throws IllegalAccessException{
        System.out.println("Inside fun()");
        throw new IllegalAccessException("Throws demo");
    }
    public static void main(String[] args) {
        try{
            fun();
        } catch(IllegalAccessException e){
            System.err.println("Error caught in main()" + e);
        }
    }
}
