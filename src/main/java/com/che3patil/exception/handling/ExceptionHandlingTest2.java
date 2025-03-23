package com.che3patil.exception.handling;

import java.io.IOException;

public class ExceptionHandlingTest2 {

    public static void main(String[] args) throws IOException {

        try {
            throw new IOException("IO Exception occurred");
        } catch (IOException e) {
            System.out.println("Caught IOException, rethrowing...");
            throw e;
        }

    }

}
