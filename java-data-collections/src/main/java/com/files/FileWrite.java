package com.files;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("write.txt");
            writer.write("I am Mohammed Falih. \nI am 21 years old.");
            writer.append("\n\nContact me: ");
            writer.append("\nEmail: thisisfalih@gmail.com");
            writer.append("\nPhone no: 7812869505");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
