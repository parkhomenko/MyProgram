package com.company;

import com.OOP.Student;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student petrov = new Student("Vasya", "Ivanov", 16);
        petrov.canBuyBeer();
        petrov.printInfo();
    }
}