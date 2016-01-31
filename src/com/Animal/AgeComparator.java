package com.Animal;

import java.util.Comparator;

/**
 * Created by Mike on 1/28/2016.
 */
public class AgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return Integer.compare(a1.getAge(),a2.getAge());

    }


}
