package rukshan.core_java.common.animal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import rukshan.core_java.common.animal.birds.*;
import rukshan.core_java.common.animal.mammals.*;
import rukshan.core_java.common.animal.fish.*;
import rukshan.core_java.common.animal.mammals.Horse;
import rukshan.core_java.common.animal.mammals.Lion;
import rukshan.core_java.common.animal.mammals.Mammal;
import rukshan.core_java.common.animal.mammals.Monkey;
import rukshan.core_java.common.animal.mammals.Whale;
public class RandomAnimalBuilder {
//Variables Seciton
	
	//constructor Section
	public RandomAnimalBuilder() {
	}
	// Method Section
	public List<? extends Animal> build(int count){
		List<Animal> result = new ArrayList<>();
		
		for (int i=1; i<=count; i++) {
			Animal a;
			a = buildMammal();
			result.add(a);
		}
		return result;
	}
	
	private Animal buildRandom() {
		Animal a = null;
		switch (ThreadLocalRandom.current().nextInt(6)) {
		case 0:
			a = buildBird(); break;
		case 1:
			a = buildMammal(); break;
		}
		return a;
	}
	private Bird buildBird() {
		Bird newBird = null;
		
		switch (ThreadLocalRandom.current().nextInt(3)){
			case 0:
				newBird = new Hawk(); break;
			case 1:
				newBird = new Monkey(); break;
			case 2:
				newBird = new Lion(); break;
			case 3:
				newMammal = new Horse(); break;
			case 4:
				newMammal = new Whale(); break;
			case 5:
				newMammal = new Dog(); break;
		}
		return newMammal;
	}
	private Mammal buildMammal() {
		Mammal newMammal = null;
		
		switch (ThreadLocalRandom.current().nextInt(5)){
			case 0:
				newMammal = new Elephant(); break;
			case 1:
				newMammal = new Monkey(); break;
			case 2:
				newMammal = new Lion(); break;
			case 3:
				newMammal = new Horse(); break;
			case 4:
				newMammal = new Whale(); break;
			case 5:
				newMammal = new Dog(); break;
		}
		return newMammal;
	}
}
