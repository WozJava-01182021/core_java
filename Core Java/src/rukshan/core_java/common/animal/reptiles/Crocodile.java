package rukshan.core_java.common.animal.reptiles;

public class Crocodile extends Reptile {
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public Crocodile() {
		setType("Crocodile");
		MAX_AGE= 100;
		MATURITY =10;
		prey.add("swans");
		prey.add("snakes");
		prey.add("rat");
		prey.add("fish");
	};
	
	
}
