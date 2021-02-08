package com.rukshan.handson1;

public class HandsOn {

	public static void main(String[] args) {
		boolean isSunny = true;
        boolean atBeach = true;

        if(isSunny) {
            System.out.println("Wear sunglasses!");

            if(atBeach) {
                System.out.println("Wear sunblock!");
            }
            else {
                System.out.println("Don't need sunblock.");
            }
        }
        else {
            System.out.println("Don't wear sunglasses.");

            if(atBeach) {
                System.out.println("Come back tomorrow.");
            }
            else {
                System.out.println("Don't go to the beach.");
            }
        }
    }

}
