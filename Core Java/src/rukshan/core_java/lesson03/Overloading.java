package rukshanv.core_java.lesson03;

import rukshanu.core_java.common.animal.Animal;
import rukshanu.core_java.common.animal.Sex;

public class Overloading {
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		simpleOverloading();
		System.out.println("==============================================================/n/n");
	}
	private void simpleOverloading() {
		System.out.println("1. Overloading in the same class");
		Animal a1 = new Animal();
		a1.setAge(1);
		a1.setRandomWeightByAge();
		System.out.println(a1);
		
		Animal a2 = new Animal();
		a2.setAge(1);
		a2.setRandomWeightByAge(100, 150, 125, 200, 10);
		System.out.println(a2);
		a2.setSex(Sex.MALE);
		a2.setRandomWeightByAge(100, 150, 125, 200, 10);
		System.out.println(a2);
	}
	private void testElephantWeights() {
		Elephant ellie = new Elephant();
		ellie.set
	}
}
