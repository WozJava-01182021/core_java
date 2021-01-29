package com.rukshanu.handson9;

import java.util.ArrayList;
import java.util.List;

public class HandsOn {

	public static void main(String[] args) {
		// Create an ArrayList of Animal objects named animalList.
		List<Animal> animalList = new ArrayList<Animal>();
		String animalType;
        do {
        	// If the input is "cat", the AnimalFactory factory will create a new Cat object and add it to the animalList list. "dog" > new Dog,"cow" > new Cow
            System.out.print("Enter animal name or exit: ");
            animalType = StudentHelper.ReadInputString();
            if(!animalType.equalsIgnoreCase("exit")) {
                Animal animal = factory.getAnimal(animalType);
                if(animal != null) animalList.add(animal);
            }
        }
        while(!animalType.equalsIgnoreCase("exit"));
		
		// Use the student input helper from the previous lesson to read in some input
	}

}
