package com.rukshanu.handson2;

public class HandsOn {

	public static void main(String[] args) {
		System.out.println(ticketPrices(72, false));
		System.out.println(ticketPrices(72, false));
		System.out.println(ticketPrices(-72, true));
		System.out.println(ticketPrices(2, false));
		System.out.println(ticketPrices(72, true));
		System.out.println(ticketPrices(17, false));
		System.out.println(ticketPrices(17, true));
	}
	public static String ticketPrices(int age, boolean isStudent) {
		String rate = null;
		if (age < 0) {
			return rate = "Invalid age";
		}
		boolean senior = (age >= 65);
		boolean child = (age <= 12);
		boolean student = isStudent;
		if (senior) {
			return rate = "Senior Citizen Rate: $7";
		} else if (child || student){
			return rate = "Child/Students Rate: $8";
		} else {
			return rate = "Tickets are $10";
		}
		
	}
}
