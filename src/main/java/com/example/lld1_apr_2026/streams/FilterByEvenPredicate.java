package com.example.lld1_apr_2026.streams;

import java.util.function.Predicate;

public class FilterByEvenPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer x) {
        return x % 2 == 0;
    }
}
