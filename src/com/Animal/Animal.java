package com.Animal;

/**
 * Created by Mike on 11/26/2015.
 */
public abstract class Animal {
    public int id;
    private int age;
    private double weight;
    private String color;
    private String type;

    public Animal(int id, int age, double weight, String color, String type) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.type = type;
    }

    public Animal() {
    }

    public void voice() {
        System.out.println(phrase());
    }

    public String phrase() {
        return "Hello";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (getId() != animal.getId()) return false;
        if (getAge() != animal.getAge()) return false;
        if (Double.compare(animal.getWeight(), getWeight()) != 0) return false;
        if (getColor() != null ? !getColor().equals(animal.getColor()) : animal.getColor() != null) return false;
        return !(getType() != null ? !getType().equals(animal.getType()) : animal.getType() != null);

    }




    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        result = 31 * result + getAge();
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getColor().hashCode();
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
