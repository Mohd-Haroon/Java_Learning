package com.example.lld1_apr_2026.generics.genericMethods;

public class Pair<T,V> {

    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public T getDefaultFirst(T value) {
        return value;
    }


}

/*
T - Type (general purpose)
V - value
E - Element
K - Key
N - Number

 */

