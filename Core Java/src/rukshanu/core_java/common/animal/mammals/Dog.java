package rukshanu.core_java.common.animal.mammals;

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
		System.out.println(name + " licks your face!");
	}
	

}
