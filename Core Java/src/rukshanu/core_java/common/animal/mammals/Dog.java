package rukshanu.core_java.common.animal.mammals;

import java.util.concurrent.ThreadLocalRandom;

import rukshanu.core_java.common.animal.Pet;

public class Dog extends Mammal implements Pet{

	private String name;
	public String getName() {return name;}	
	public void setName(String s) {name = s;}
	
	public Dog() {
		setType("dog");
		MAX_AGE = 16;
		MATURITY = 2;
	}
	
	String breed;
	public String getBreed() {return breed;	}
	public void setBreed(String b) { breed = b; }
	@Override
	public boolean hasLicense() {
		return true;
	}
	@Override
	public void beFriendly() {
		String describe = name + " the " + breed;	
	System.out.println(describe + " licks your face.");	
	}
	//Overloading method with a Return Array of type dog
	//Overloading method with a Return Array of type dog
		public Dog[] reproduce(int number) {
			Dog[] litter = new Dog[number];
			if (getSex() == Sex.MALE) {
				System.out.println("Male " + getType()+ " looking for female" + getType());
				return null;
			}
			
			if(getAge() > MATURITY) {
				for (int i=0; i<litter.length; i++) {
					Dog baby = new Dog();
					if (ThreadLocalRandom.current().nextBoolean()) {
						baby.setSex(Sex.MALE);
					}
					litter[i] = baby;
				}
			}else {
				return null;
			}
			
			return litter;
		}
	}
