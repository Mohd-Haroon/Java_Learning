package com.example.lld1_apr_2026.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClient {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,2,7,3,4,6,6,10,1,9,8,9);

        // Step 1: Open a stream
        Stream<Integer> stream = list.stream();
        // Step 2: keep only even numbers
        list = stream
                .filter(x -> x % 2 == 0)
                .sorted()
                .map(x -> x*x) // square each number
                .distinct()
                .collect(Collectors.toList());

        stream.forEach(System.out::print);


        System.out.println(list);

        Optional<Integer> any = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .sorted()
                .findFirst();

        System.out.println(any);

        Optional<Integer> result = list.stream().filter(x -> x > 1000).findAny();
        System.out.println(result);

        if (result.isPresent()) {
            System.out.println("Found: " + result.get());
        } else {
            System.out.println("No element matched the filter");
        }

        int[] resArray= list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
