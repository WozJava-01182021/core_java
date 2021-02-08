package rukshan.core_java.common.animal.reptiles;

public class Snake extends Reptile {

	/**
	 *
	 */
	private static final long serialVersionUID = 3014021861134353676L;

	public Snake() {
		setType("snake");
		MAX_AGE= 100;
		MATURITY = 4;
		prey.add("swans");
		prey.add("snakes");
		prey.add("rat");
		prey.add("squirrels");
	}
	
//	@Override
//	public void eat() {
//		System.out.println(" is found eating a mouse");
//	}
//	@Override
//	public void move() {
//		System.out.println(" can move at 22mph");
//	}

}
