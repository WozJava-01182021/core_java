package rukshan.core_java.common.animal.birds;

import rukshan.core_java.common.animal.Animal;

public abstract class Bird extends Animal {

    protected BirdFood food;

    public String getFood() {
        return food.toString().toLowerCase(); // enum would return CAPital case
    };

    @Override
    public String toString() {
        String result = getType() + "(" + getAge() + "yrs," + getWeight() + " g";
        result += ", " + getSex().toString().charAt(0) + ")";
        return result;
    };

    public Bird() {
        setType("UNKNOWN BIRD");
        MAX_AGE = 12;
        MATURITY = 2;

    };

    @Override
    public void move() {
        if (canFly()) {
            System.out.println(getType() + " flying!");
        } else if (canRun()) {
            System.out.println(getType() + " running!");
        } else if (canSwim()) {
            System.out.println(getType() + " swimming!");
        } else {
            throw new RuntimeException("bird can't fly, run nor swim");
        }
    }

    @Override
    public void sleep() {
        System.out.println(getType() + " is found sleeping in a nest!");
    }

    // Bird Methods
    public boolean canFly() {
        return true;
    } // Override if necessary

    public abstract boolean canRun();

    public abstract boolean canSwim();

};
