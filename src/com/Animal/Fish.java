package com.Animal;

/**
 * Created by Mike on 11/26/2015.
 */
public class Fish extends Domestic{
    public Fish(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color,name, isVaccinated);

    }

    public Fish() {
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
        String result = "......";

        return result;
    }



}
