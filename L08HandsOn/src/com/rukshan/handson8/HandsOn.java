package com.rukshan.handson8;

public class HandsOn {

	public static void main(String[] args) {
		Mammal fido = new Dog();
		Mammal fluffy = new Cat();
		Mammal bessie = new Cow();
		
		Reptile shelly = new Turtle();
		Reptile lizzy = new Lizard();
		
		fido.speak();
		fluffy.speak();
		bessie.speak();
		fido.run();
		fluffy.run();
		bessie.run();
		lizzy.crawl();
		shelly.crawl();
		fido.eat();
		fluffy.eat();
		bessie.eat();
		lizzy.eat();
		shelly.eat();
	}

}
