package com.Animal;

/**
 * Created by Mike on 11/26/2015.
 */
public class Dog extends Domestic implements Roarable{
    boolean isTrained;


    public Dog(int id, int age, double weight, String color, String type, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, type, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public Dog() {
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

        String result = super.phrase();
        if (isTrained == true) {
            result = super.phrase() + ". I can take you home";
        } else {
            result = super.phrase() + ". Woof!";
        }
        return result;
    }

    @Override
    public void roar() {
        System.out.println("Dog Roar");
    }
}
