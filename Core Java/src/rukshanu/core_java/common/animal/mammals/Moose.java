package rukshan.core_java.common.animal.mammals;

import rukshan.core_java.common.animal.Sex;
import rukshan.core_java.common.animal.ecosystem.EcosystemType;

public class Moose extends Mammal{
	{
		MAX_AGE = 15;
		FEMALE_MATURITY = 4;
		MALE_MATURITY = 4; 
		BIRTH_WEIGHT = 1;
		ADULT_FEMALE_MIN_WEIGHT = 290;
		ADULT_FEMALE_MAX_WEIGHT = 400;
		ADULT_MALE_MIN_WEIGHT = 400;
		ADULT_MALE_MAX_WEIGHT = 790;
		TEETH = 42;
	}
	
	public Moose() {
		// remember private makes it invisible to other classes so we can't get the variable: type inside of Animal
		setType("moose"); // THIS IS WHY WE USE PROTECTED in Animal Class!!
		setEcosystem(EcosystemType.YELLOWSTONE);
		setMaxRunningSpeed(35);

	};
	
	public Moose(int age, int weight, Sex sex) {
		this();
		setAge(age);
		setWeight(weight);
		setSex(sex);
	}
	
	@Override
	public void sleep() {
		System.out.print(this + " sleeping with herd ");
		while (getHealth() < 3) {
			System.out.print(getHealth() + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { e.printStackTrace(); }
			changeHealth(1);
		}
		System.out.println(getHealth());
	}
	
	@Override
	public void move() {
		if(getAge() > MAX_AGE) {
			return;
		}else if(getAge() > MAX_AGE - 2) {
			System.out.println(getType() + "old bear moves very slowly");
			changeHealth(-4);
		}else if(getAge() > MATURITY) {
			System.out.println(getType() + " is roaming around the forest");
			changeHealth(-2);
		}else if(getAge() == 0) {
			 System.out.println(" bear cub playing with siblings");
		}else {
			System.out.println("Young bear learning to sneak up on prey");
		}
	};
	
}
