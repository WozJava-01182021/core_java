package com.rukshanu.handson5;
import java.util.Random;

public class Person {
   // instance variables
   private String firstName;
   private String lastName;
   private int age;
   
   static Random rand;

   // Default constructor
   Person(){
       firstName = "";
       lastName = "";
       age = 0;
   };
   
/*
 * 	First name
	First and last name
	First name, last name, and age
 */
   Person(String name){
	   rand = new Random();
	   int randInt = rand.nextInt(60) + 1;
	   firstName = name;
	   lastName = name + "son";
	   age = randInt;
   };
   Person(String first, String last){
	   rand = new Random();
	   int randInt = rand.nextInt(60) + 1;
	   firstName = first;
	   lastName = last;
	   age = randInt;
   };
   Person(String first, int years){
	   firstName = first;
	   lastName = first + "son";
	   age = years;
   };
   Person(String first, String last, int years){
	   firstName = first;
	   lastName = last;
	   if (years >= 0) {
		   age = years;
	   } else {
		   System.out.println("Attempted to set age to an invalid value. Setting age to 0 instead");
		   age = 0;
	   };
   };
   // Print all the data for a person
   public void print()
   {
     System.out.println("Name: " + firstName);
     System.out.println("Email: " + lastName);
     System.out.println("Phone Number: " + age);
   }

   // main method for testing
   public static void main(String[] args)
   {
      // call the constructor to create a new person
      Person p1 = new Person();
      // call p1's print method
      p1.print();
      Person p2 = new Person();
      p2.print();
   }
}
