package com.Animal;

/**
 * Created by Mike on 11/26/2015.
 */
public class Wild extends Animal {

    private boolean isPredator;

    public Wild(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public Wild() {

    }

    public String phrase() {
        String result = super.phrase();
        if (isPredator == false) {
            result = super.phrase() + " and I am a wild animal";
        } else {
            result = super.phrase() + " and I am angry";
        }
        return result;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setIsPredator(boolean isPredator) {
        this.isPredator = isPredator;
    }
}

