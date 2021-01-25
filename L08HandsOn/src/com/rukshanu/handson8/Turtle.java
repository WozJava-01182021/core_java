package com.rukshanu.handson8;

public class Turtle implements Reptile{
	private int speed;
	private String food;
	Turtle(){
		this.setFood("lettuce");
		this.setSpeed(2);
		
	}
	
	public int getSpeed() {
	    return speed;
	}
	public void setSpeed(int speed) {
	    this.speed = speed;
	}
	public void setFood(String food) {
	    this.food = food;
	}
	public String getFood() {
		return food;
	}

	public String crawl() {
		String topSpeed = String.format("%ss can crawl at a top speed of %s mph!",this.getClass().getSimpleName(), this.speed);
		System.out.println(topSpeed);
		return topSpeed;
	}
	public String eat() {
		String mealPlan = String.format("%ss eat %s.", this.getClass().getSimpleName(), this.food);
		System.out.println(mealPlan);
		return mealPlan;
	}
}
