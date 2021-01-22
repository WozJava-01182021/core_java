/*
* Interfaces are like 100% abstract classes and are a contract:
 *    A Java Interface can contain only method declarations and public static
 *    final constants and doesn't contain their implementation. The classes
 *    which implement the Interface must provide the method definition for all
 *    the methods present.
 *
 * An interface is also used in situations when a class needs to extend more
 *    than one class. In java its not possible to have multiple inheritance of
 *    classes. An interface can be used when it is required to implement more
 *    than one interfaces.
 *
 * Interface Rules
 *	1. Interface methods are implicitly public and abstract (Java 8: unless declared default or static)
 *	2. All variables defined in an interface must be public, static and final (constants)
 *	3. Interface methods cannot be final, strictfp or native
 *	4. An interface can extend one or more other interfaces
 *	5. An interface cannot extend anything but another interface
 *	6. An interface cannot implement anything (interface or class)
 *	7. An interface must be declared with the keyword interface
 *	8. Interface types can be used polymorphically
 
 */ package rukshanu.core_java.lesson02;

import rukshanu.core_java.common.animal.mammals.*;

public class Interfaces {
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWor()");
		
		System.out.println("==========================================================\n\n");
		testPetInterface();
	}
	private void testPetInterface() {
		System.out.println("1. Test the Pet Interface");
		Dog aDog = new Dog();
		System.out.println(aDog);
		aDog.setName("Lassie");
		aDog.setBreed("collie");
		aDog.beFriendly();
		
		Cat aCat = new Cat();
		System.out.println(aCat);
		aCat.setName("Morris");
		aCat.setBreed("tabby");
		aCat.beFriendly();
		
		Horse aHorse = new Horse();
		System.out.println(aHorse);
		aHorse.setName("Mr. Ed");
		aHorse.setBreed("Mustang");
		aHorse.beFriendly();
	}
}
