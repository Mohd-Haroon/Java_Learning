package com.example.lld1_apr_2026.exceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        // 1. ArithmeticException
//        int result = 10 / 0;   //  ArithmeticException: / by zero

        // 2. NullPointerException
//        String s = null;
//        s.length();            //  NullPointerException
//
//        // 3. ArrayIndexOutOfBoundsException
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); //  ArrayIndexOutOfBoundsException
    }


}
