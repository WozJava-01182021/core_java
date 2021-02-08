package com.rukshan.handson4;

public class HandsOn {

	public static void main(String[] args) {
		doubleMe(1);
		System.out.println(String.format("Value: %s\nDoubled: %s\n", 1, doubleMe(1)));
		quadrupleMe(2);
		System.out.println(String.format("Value: %s\nQuadrupled: %s\n", 2, quadrupleMe(2)));
		doubleMeTimes(2,3);
		System.out.println(String.format("Value: %s\nTimes: %s\nResult: %s", 2, 3, doubleMeTimes(2,3)));
	}
	public static int doubleMe(int val) {		
		return val * 2;
	}
	
	public static int quadrupleMe(int val) {
		return doubleMe(doubleMe( val));
	}
	public static int doubleMeTimes(int val, int count) {
		int doubleTime = val;
		for (int i = 0; i < count; i++) {
			  doubleTime = doubleMe(doubleTime);
			}
		return doubleTime;
	}
}
