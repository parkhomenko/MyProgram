package com.company;

import com.Animal.Cat;
import com.Animal.Dog;
import com.Animal.Fish;
import com.Animal.Wild;
import com.OOP.Group;
import com.OOP.Student;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Student ivanov = new Student("Vasya", "Ivanov", 16);
//        Student petrov = new Student("Petya", "Petrov", 16);
////        petrov.canBuyBeer();
////        petrov.printInfo();
//        Group Hillel = new Group(10);
//        Hillel.setName("Hillel");
//        Hillel.addStudent(petrov);
//         Hillel.printGroup();

        Dog bob = new Dog(1, 10, 20, "white", "Bob", true,true);
        bob.voice();
        System.out.println();
        Cat puss = new Cat(2, 10, 20, "gray", "Barsik", true);
        puss.voice();
        System.out.println();
        Wild giraffe = new Wild(3, 5, 100, "green", false);
        giraffe.voice();
        System.out.println();
        Wild croc = new Wild(4, 5, 100, "green", true);
        croc.voice();
        System.out.println();
        Fish nemo=new Fish(1,2,3,"gold","Nemo",true);
        nemo.voice();
    }
}