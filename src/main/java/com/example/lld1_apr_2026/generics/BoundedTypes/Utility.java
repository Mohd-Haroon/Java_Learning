package com.example.lld1_apr_2026.generics.BoundedTypes;

import java.util.List;

public class Utility {
    public void feedAnimals(List<? extends Animal> animals) {
        for (Animal a: animals) {
            // Whether it is a DOg, Cat, Animal - they are all Animals
            // So assigning to an Animal variable always works
            a.eat(); // Every animal is going to has eat() function
        }
    }

//    public void feedAnimals(List<? extends Animal> animals) { // List<Animal>, List<Dog>, List<Cat>, List<Mammal>
//        animals.add(new Dog()); // Compile error?
        // Dog is an Animal
        //

    // ? super T -> (Lower Bounded Wildcard)
    //
    public void addDogs(List<? super Dog> list) { // List<Dog>, List<Mammal>, List<Animal>, List<Object>
        list.add(new Dog()); // safe to add Dogs\
//        Dog d = list.getFirst();
//        d.bark();
    }

    // ? super Dog -> some unknown type which is Dog or a parent of Dog

}
