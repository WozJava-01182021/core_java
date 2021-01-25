package com.rukshanu.handson7;

public class HandsOn {

	public static void main(String[] args) {
		Employee me = new Employee("Rukshan", "Uddin", "Trilogy Education", 1);
		System.out.println(me.toString());
		Manager julian = new Manager("Julian", "Jimenez", "Trilogy Education", 5, "Central Grading Team Manager");
		System.out.println(julian.toString());
		Engineer xander = new Engineer("Xander", "Rapstine", "Trilogy Education", 10, "Senior Developer");
		System.out.println(xander);
	}

}
