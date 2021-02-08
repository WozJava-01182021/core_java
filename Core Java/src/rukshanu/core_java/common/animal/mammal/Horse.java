package rukshan.core_java.common.animal.mammal;

import rukshan.core_java.common.animal.Pet;

public class Horse extends Mammal implements Pet {
	
	public Horse() {
		setType("horse");
		MAX_AGE = 30;
		MATURITY = 6;
	}

//Class Animal overrides
		@Override
		public void eat() {
			System.out.println(getType() + " grazes on grass");
		}
		
		@Override
		public void move() {
			System.out.println(getType() + " gallops");
		}
		
		@Override
		public void sleep() {
			System.out.println(getType() + " lays on its side");
		}
		@Override
		public void beFriendly() {
			System.out.println(name + " gallops towards the sunset!");
		}
		
		private String name;
		@Override
		public String getName() {return name;}	
		@Override
		public void setName(String s) {name = s;}

		String breed;
		@Override
		public String getBreed() {return breed;	}
		@Override
		public void setBreed(String b) { breed = b; }

		@Override
		public boolean hasLicense() {
			return false;
		}
}
