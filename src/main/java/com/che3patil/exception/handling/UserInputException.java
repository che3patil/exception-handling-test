package com.che3patil.exception.handling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputException {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            int next = scanner.nextInt();
            System.out.println(next + next);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
