package com.rukshan.handson5;

public class HandsOn {

	public static void main(String[] args) {
        // No args
        System.out.println("Default(no names or age)");
        Person d = new Person();
        System.out.println(d.getFirstName() + " " + d.getLastName() + " age = " + d.getAge());
        System.out.println();
        // Person with First name
        System.out.println("First name only (Robert)");
        Person rob = new Person("Robert");
        System.out.println(rob.getFirstName() + " " + rob.getLastName() + " age = " + rob.getAge());
        System.out.println();
        // Person with first and last names
        System.out.println("First name and last name (Robert Downey Jr.)");
        Person rd = new Person("Robert", "Downey");
        System.out.println(rd.getFirstName() + " " + rd.getLastName() + " age = " + rd.getAge());
        System.out.println();
        // Person with first name and age
        System.out.println("First name, age (Robert, 34)");
        Person rdjAge = new Person("Robert", 34);
        System.out.println(rdjAge.getFirstName() + " " + rdjAge.getLastName() + " age = " + rdjAge.getAge());
        System.out.println();
        // Person with first and last names plus age
        System.out.println("First name, last name and age (Robert Downey Jr., 55)");
        Person robAge = new Person("Robert", "Downey Jr.", 55);
        System.out.println(robAge.getFirstName() + " " + robAge.getLastName() + " age = " + robAge.getAge());
        System.out.println();
        // Person with invalid age
        //		Should warn
        System.out.println("Robert Downey the Third");
        Person rdThird = new Person("Robert", "Downey the Third", -10);
        System.out.println("Robert Downey the Third age = " + rdThird.getAge());
        System.out.println();
        // change age to invalid value
        //		The warning about the invalid age should be shown
        System.out.println("Setting Invalid age (Robert Downey the Third)");
        rdThird.setAge(-2);
        System.out.println("Set Robert Downey the Third = " + rdThird.getAge());
    }

}
