package com.che3patil.exception.handling;

import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        File file = new File("non_existent_file.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String s = bufferedReader.readLine();
                System.out.println(s);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found! Please check the file path.");
        }

    }
}
