package com.example.lld1_apr_2026.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemoThrow {
    static void find(int x) throws FileNotFoundException, ClassNotFoundException {
        if (x % 2 == 0) {
            throw new ArithmeticException("Even number - arithmetic error");
        } else if (x % 3 == 0) {
            throw new NullPointerException("Divisible by 3 - null pointer");
        } else if (x % 5 == 0) {
            throw new FileNotFoundException("Divisble by 5 - file not found");
        } else if (x % 7 == 0) {
            throw new ClassNotFoundException("Class Not found exception");
        }
        System.out.println("No exception for: " + x);
    }

    public static void main(String[] args) throws IOException {

//        find(4);  // ArithmeticException
//        find(9);  // NullPointerException
        Scanner in = null;
//        FileReader reader = new FileReader("file.txt");;
        try{
            in = new Scanner(System.in);
            // Code that might throw an exception
            // If thrown, execution jumps immediately to the matching catch statement
            // Remaining lines in the try block are skipped
            find(5); // Throws FileNotFoundException
            find(3);
            find(2);
            find(7); // Throws a class not found exception

            // If find throws an exception all lines after that are skipped in try
            in.close();
            System.out.println("Inside try block");
        } catch (FileNotFoundException e) {
            System.out.println("File is not found! Please check if the file exists.");
            System.out.println("Details: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("This should not happen - logic mistake in code");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Catch all - what may come
            System.out.println("Something unexpected: " + e.getMessage());
        } finally {
            // Always runs - exception or not
            System.out.println("Clean up - releasing resources");
            in.close();
//            reader.close();
        }

        // No code is going to execute
        System.out.println("Not executed");
    }
}
