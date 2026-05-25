package com.example.lld1_apr_2026.generics.genericMethods;

public class Utility<T> {
//    private static T val;

    // <T> before the return type declares the T for this method
    public static <T> void printArray(T[] array) {
        for (T item: array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }


    public static <T> T getFirst(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return array[0];
    }

    public static <T,V> Pair<T,V> makePair(T first, V second) {
        return new Pair<>(first, second);
    }

    // A method with no arguments - T can't be inferred
    public static <T> T getDefault() {
        return null;
    }


//    public static void printArray(int[] array) {
//        for (int item: array) {
//            System.out.print(item + " ");
//        }
//        System.out.println();
//    }
}

/*
<T> - declares the type parameter
T (second one) - the return type
T[] array - the parameter type
 */
