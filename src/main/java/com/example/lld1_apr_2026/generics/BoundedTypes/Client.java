package com.example.lld1_apr_2026.generics.BoundedTypes;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        dogs.add(new Dog());

        Utility utility = new Utility();

        utility.feedAnimals(dogs);
        utility.feedAnimals(cats);
        utility.feedAnimals(animals);

        utility.addDogs(animals);
        Animal animal = animals.get(0);
        animal.eat();



    }
}
