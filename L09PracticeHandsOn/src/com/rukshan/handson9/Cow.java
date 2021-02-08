package com.rukshan.handson9;
//Cat, Dog, Cow: The three child classes should extend the Animal class. The constructor in each class should set the name of the animal to the animal it is (e.g. "cow").

//should inherit from a parent class named Animal

public class Cow extends Animal {

    public Cow() {
        super(new Animal.AnimalBuilder("cow", 3, 3, 3));
    }
}
