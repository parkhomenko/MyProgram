package com.OOP;

/**
 * Created by Mike on 1/31/2016.
 */
public class GenericsApp {

    public static void main(String[] args) {
        int arrayLength = 10;
        int array[] = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("--------");
        twoDigitsFinder(array, 120);
    }

    public static void twoDigitsFinder(int[] array, int N) {

        int firstNumber = array[0];
        int secondNumber = array.length;
        for (int i = 0; i < array.length; i++) {
            if (firstNumber + secondNumber == N) {
                System.out.print("first number " + " " + firstNumber + " " + "second number = " + secondNumber);
                break;
            }
            if (checkN(array,N) ==true){
                System.out.println("There are no such numbers");
                break;
            }else if (N > array.length) {

                firstNumber = array[i + 1];
            } else {
                secondNumber = array.length - i;
            }
        }
    }

    public static boolean checkN(int array[], int N){
        return((array.length + (array.length - 1) < N)|| ((array[0] + array[1]) > N));


    }
}