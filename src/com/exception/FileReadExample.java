package com.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
	public static void main(String[] args) {
        String fileName = "D:\\Rohit\\input.txt"; // File should exist

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
           
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close(); 

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: File '" + fileName + "' not found.");
        } catch (IOException e) {
            System.out.println("IOException caught: Error while reading the file.");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after handling exceptions.");
    }

}
