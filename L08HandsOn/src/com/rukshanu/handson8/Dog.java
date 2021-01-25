package com.rukshanu.handson8;

public class Dog implements Mammal{
	private int speed;
	private String cry;
	private String food;
	
	public Dog() {
		this.setSpeed(45);
		this.setCry("Woof!");
		this.setFood("bones");
	}

	public int getSpeed() {
	    return speed;
	}
	public void setSpeed(int speed) {
	    this.speed = speed;
	}
	public String getCry() {
		return cry;
	}
	public void setFood(String food) {
	    this.food = food;
	}
	public String getFood() {
		return food;
	}

	public void setCry(String cry) {
	    this.cry = cry;
	}
	
	public String speak() {
		System.out.println(this.cry);
		return this.cry;
	}
	public String run() {
		String topSpeed = String.format("%ss can run at a top speed of %s mph!",this.getClass().getSimpleName(), this.speed);
		System.out.println(topSpeed);
		return topSpeed;
	}
	public String eat() {
		String mealPlan = String.format("%ss eat %s.", this.getClass().getSimpleName(), this.food);
		System.out.println(mealPlan);
		return mealPlan;
	}

	
}
