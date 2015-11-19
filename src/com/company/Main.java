package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your number ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int arrLength = number;
        System.out.println("your number is " + number);
        int counter = 0;
        while (arrLength / 10 >= 0 && arrLength != 0) {
            ++counter;
            arrLength = arrLength / 10;
        }

        int arr[] = new int[counter];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number % 10;
            number = number / 10;
        }
        System.out.println("your backwards number  ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
        System.out.println();
        boolean b = true;
        for (int k = 0; k < arr.length / 2; k++) {
            if (arr[k] != arr[arr.length - 1]) {
                b = false;
                break;
            }
        }
        if (b)
            System.out.println("your number is palindromic");
        else System.out.println("your number is not palindromic");

        System.out.println("Array 10x10");
        int arr10x10[][] = new int[10][10];
        for (int l = 0; l < arr10x10.length; l++) {
            for (int m = 0; m < arr10x10[l].length; m++) {
                arr10x10[l][m] = (int) (Math.random() * 40 - 20);
            }
        }

        for (int l = 0; l < arr10x10.length; l++) {
            int sumString = 0;
            for (int m = 0; m < arr10x10[l].length; m++) {
                sumString += arr10x10[l][m];
            }
            System.out.println("sum of string = " + sumString);

        }


        for (int l = 0; l < arr10x10.length; l++) {
            for (int j = 0; j < arr10x10[l].length; j++) {
                System.out.print(arr10x10[l][j] + ",");
            }
            System.out.println();
        }
        int max = arr10x10[0][0];
        for (int l = 0; l < arr10x10.length; l++) {
            for (int m = 0; m < arr10x10[l].length; m++) {
                if (arr10x10[l][m] > max)
                    max = arr10x10[l][m];
            }
        }
        System.out.println("max number =" + max);
        for (int l = 0; l < arr10x10.length; l++) {
            for (int j = 0; j < arr10x10[l].length; j++) {
            }
        }
        System.out.println();

        int min = arr10x10[0][0];
        for (int l = 0; l < arr10x10.length; l++) {
            for (int m = 0; m < arr10x10[l].length; m++) {
                if (arr10x10[l][m] < min)
                    min = arr10x10[l][m];
            }
        }
        System.out.println("min number =" + min);
        System.out.println();
        int sum = arr10x10[0][0];
        for (int l = 0; l < arr10x10.length; l++) {
            for (int m = 0; m < arr10x10[l].length; m++) {
                sum = arr10x10[l][m] + sum;
            }
        }
        System.out.println("sum =" + sum);
        System.out.println();
        double avrg = arr10x10[0][0];
        for (int l = 0; l < arr10x10.length; l++) {
            for (int m = 0; m < arr10x10[l].length; m++) {
                avrg = sum / 100.0;
            }
        }
        System.out.println("Average =" + avrg);
        System.out.println();
        int negative = 0;
        int posetive = 0;
        for (int l = 0; l < arr10x10.length; l++) {
            for (int m = 0; m < arr10x10[l].length; m++) {
                if (arr10x10[l][m] < 0) {
                    negative++;
                } else {
                    posetive++;
                }
            }
        }
        System.out.println("Negative numbers =" + negative);
        System.out.println("Positive numbers =" + posetive);
        System.out.println();


    }
}