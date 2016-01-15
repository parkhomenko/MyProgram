package com.Animal;

/**
 * Created by Mike on 11/26/2015.
 */
public class Cat extends Domestic {
    public Cat(int id, int age, double weight, String color, String type, String name, boolean isVaccinated) {
        super(id, age, weight, color, type, name, isVaccinated);

    }

    public Cat() {
    }

    @Override
    public boolean equals(Object o) {

        return super.equals(o);

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String phrase() {
        String result = super.phrase() + ". Meow!";

        return result;
    }
}
