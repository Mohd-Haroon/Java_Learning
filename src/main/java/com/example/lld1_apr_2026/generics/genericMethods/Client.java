package com.example.lld1_apr_2026.generics.genericMethods;

public class Client {
    public static void main(String[] args) {
//        Pair<Integer, String> pair = new Pair<>(1, "Alok");
//        Pair.getDefaultFirst(); // T ?

        String[] names = {"Shilpa", "Manvendra", "Alok"};
        Integer[] scores = {95, 76, 89};

        Utility.printArray(names); // T is inferred as String
        Utility.printArray(scores); // T is inferred as Integer

        String firstName = Utility.getFirst(names); // Return "Shilpa"
        Integer firstScore = Utility.getFirst(scores); // Returns 95

        Pair<Integer, String> pair = Utility.makePair(1, "Rajeev");

        // Usage - must explicitly tell java what T is:
        String s = Utility.<String>getDefault(); // T = String
        Integer n = Utility.<Integer>getDefault(); // T = Integer

//        Pair<int, long> pair1 = new Pair<int, long>(1,2);

//        pair1.getFirst();
    }
}
