package com.Animal;

/**
 * Created by Mike on 11/26/2015.
 */
public class Dog extends Domestic {
    boolean isTrained;

    public Dog(int id, int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public Dog() {
    }

    public String phrase() {

        String result = super.phrase();
        if (isTrained == true) {
            result = super.phrase() + ". I can take you home";
        } else {
            result = super.phrase() + ". Woof!";
        }
        return result;
    }

}
