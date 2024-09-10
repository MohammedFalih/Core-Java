package com.exception_handling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("null")
    public static void main(String[] args) throws IOException {
        int a=10, b=0;
        int c = 0;

        System.out.println("\nException Handling in Java: ");
        try {
            c = a/b;
            int[] arr = null;
            System.out.println(arr[1]);
        } catch (ArithmeticException e) {
            System.err.println("Error Occured: " + e);
        } catch (NullPointerException e) {
            System.err.println("Error occured: " + e);
        } catch (Exception e){
            System.err.println("Error: " + e);
        } finally {
            System.out.println("Finally block - gets printed no matter what.");
        }

        System.out.println("\nFile Exception");
        
        File new_file = new File("abc.txt");
        try {
            FileInputStream fs = new FileInputStream(new_file);
            fs.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } finally {
            System.out.println("Final block");
        }

        System.out.println("c: " + c);
        System.out.println("End of the program..");

        /*
         *  this scanner object need to be closed in the end.. 
         *  Scanner scanner = new Scanner(System.in);
         *  scanner.nextLine();
         * 
         */
        
         try(Scanner scanner = new Scanner(System.in)) {
            scanner.nextLine();
         } catch (Exception e) {
            System.err.println("Error occured: " + e);
        }
    }
}