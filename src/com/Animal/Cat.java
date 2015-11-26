package com.Animal;

/**
 * Created by Mike on 11/26/2015.
 */
public class Cat extends Domestic {
    public Cat(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);

    }

    public Cat() {
    }

    public String phrase() {
        String result = super.phrase() + ". Meow!";

        return result;
    }
}
