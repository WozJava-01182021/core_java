package com.rukshanu.handson9;
//Cat, Dog, Cow: The three child classes should extend the Animal class. The constructor in each class should set the name of the animal to the animal it is (e.g. "cow").

//should inherit from a parent class named Animal

public class Dog extends Animal {
	
    public Dog() {
        super(new Animal.AnimalBuilder("dog", 2, 2, 2));
    }

}
