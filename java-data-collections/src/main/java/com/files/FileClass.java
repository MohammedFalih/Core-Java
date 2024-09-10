package com.files;
import java.io.File;
public class FileClass {
    public static void main(String[] args) {
        File file = new File("/home/falih/Java/java-data-collections/src/main/java/com/files/file1.txt");

        if (file.exists()) {
            System.out.println("File exists..");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.toPath());
            System.out.println(file.getPath());
            System.out.println(file.isFile());
            file.delete();
        } else {
            System.out.println("File does not exists.");
        }
    }
}
