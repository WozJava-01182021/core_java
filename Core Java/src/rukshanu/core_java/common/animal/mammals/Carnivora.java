package rukshanu.core_java.common.animal.mammals;

import java.util.ArrayList;
import java.util.List;

import rukshanu.core_java.common.animal.Animal;
import rukshanu.core_java.common.animal.Carnivore;

/**
 * An animal of 
 *
 */
public abstract class Carnivora extends Mammal implements Carnivore {

	// Variables
	protected List<String> prey = new ArrayList<>();
	protected String preyFound = null;
	protected String preyCaught = null;
	//Constructor Section
	public Carnivora() {
		setType("unknown carnivore");
	}
	// Method Section
	//Support Carnivore Interface
	@Override
	public void eat() {
		if (preyCaught == null || preyCaught.isEmpty()) {
			System.out.println(getType() + " has nothing to eat.");
		}else {
			System.out.println(getType() + " eats a " + preyCaught + ".");
			preyCaught = null;
		}
	}
	@Override
	public void hunt() {
		// TODO Auto-generated method stub

	}

	@Override
	public String findPrey() {
		if (preyFound == null) {
			int x = (int)(Math.random() * prey.size());
			preyFound = prey.get(x);
		}
		return preyFound;
	}

	@Override
	public boolean catchPrey(Animal target) {
		if (preyFound == null || preyFound.isEmpty()) {
			System.out.println(getType() + " has not found food yet.");
			return false;
		}else {
			double probability = Math.random();
			if (probability > .5) {
				preyCaught = preyFound;
				return true;
			}
			return false;
			
		}
	}

}