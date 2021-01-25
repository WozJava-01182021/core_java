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
       firstName = "John";
       lastName = "Doe";
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
   private void validateAge() {
       if(age < 0) {
           age = 0;
           System.out.println("Attempted to set age to an invalid value. Setting age to 0 instead.");
       }
   }
   public String getFirstName() {
       return firstName;
   }

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public int getAge() {
       return age;
   }
   public void setAge(int age) {
       this.age = age;
       validateAge();
   }

   // main method for testing
   public void main(int years)
   {
      age = years;
      validateAge();
   }
}
