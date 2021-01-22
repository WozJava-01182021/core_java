package rukshanu.core_java.common.animal.mammals;

import rukshanu.core_java.common.animal.Pet;

public class Cat extends Carnivora implements Pet{

	private String name;
	public String getName() {return name;}	
	public void setName(String s) {name = s;	}
	
	public Cat() {
		setType("cat");
		name = "";
		MAX_AGE = 20;
		MATURITY = 2;
	}
	
	String breed;
	@Override
	public String getBreed() {return breed;	}
	@Override
	public void setBreed(String b) { breed = b; }
	@Override
	public boolean hasLicense() {
		return true;
	}
	@Override
	public void beFriendly() {
		System.out.println(name + " rubs against your leg!");
	}

}
