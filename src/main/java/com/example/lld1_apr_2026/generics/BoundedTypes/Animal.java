package com.example.lld1_apr_2026.generics.BoundedTypes;

import java.util.List;

class Animal {
    void eat() { System.out.println("Eating..."); }


    // This only accepts List<Animal>, List<Dog>, List<Cat>
//    public void feedAnimals(List<Animal> animals) {
//        for (Animal a: animals) {
//            a.eat();
//        }
//    }

    // ? extends T (Upper Bounded Wildcard)
    // Animal is an upper bound -> All children are below

}
