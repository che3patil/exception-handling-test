package com.che3patil.exception.handling;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandlingTest {

    static {
        System.out.println("this is inside static block");
    }

    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
        }

    }
}
