package com.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader file_reader = new FileReader("/home/falih/Java/java-data-collections/src/main/java/read.txt");

            int data = file_reader.read();
            while(data != -1){
                System.out.print((char)data);
                data = file_reader.read();
            }
            System.out.println();
            file_reader.close();
            } catch (FileNotFoundException e)  {
                e.printStackTrace();
            } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("\n\nFile 2: ");
        try {
            File myObj = new File("/home/falih/Java/java-data-collections/src/main/java/new.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String lines = myReader.nextLine();
                System.out.println(lines);
            }
            myReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}