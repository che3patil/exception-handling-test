package com.che3patil.exception.handling;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 30 / 0; // This will throw ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Some other exception occurred.");
        }
    }
}
