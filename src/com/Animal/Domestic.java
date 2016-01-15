package com.Animal;

/**
 * Created by Mike on 11/26/2015.
 */
public abstract class Domestic extends Animal {
    private String name;
    private boolean isVaccinated;

    public Domestic(int id, int age, double weight, String color, String type,String name, boolean isVaccinated) {
        super(id, age, weight, color,type);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public Domestic() {
    }


    @Override
    public boolean equals(Object o) {
        if (getName().equals(this.getName())) {
            return super.equals(o);
        }else return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String phrase() {
        String result = super.phrase();
        if (name != null) {
            result = " my name is " + getName();
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

}
