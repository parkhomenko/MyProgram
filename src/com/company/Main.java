package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//       Improved calculater Problem 0
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter + or - or * or / for result");
        String command = sc1.nextLine();

        if (command.equals("+")) {
            System.out.println("result =" + (a + b));
        } else if (command.equals("-")) {
            System.out.println("result =" + (a - b));
        } else if (command.equals("*")) {
            System.out.println("result =" + (a * b));
        } else if (command.equals("/") && b == 0) {
            System.out.println("Error dividing by 0");
        } else {
            System.out.println("result =" + (a / b));
        }
//        problem 1 - average amount for any quantity of numbers
        System.out.println();
        System.out.println("------------------------");
        System.out.println("enter quantity of numbers to find average");
        Scanner sc3 = new Scanner(System.in);
        int quontinyOfNumbers = sc3.nextInt();
        double[] array = new double[quontinyOfNumbers];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter your numbers");
            array[i] = sc3.nextDouble();
        }
        System.out.println("your numbers are");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        System.out.println("sum = " + sum + " average amount =" + (sum / quontinyOfNumbers));

//    Problem2 Bank deposit and interest rate
        Scanner sc4 = new Scanner(System.in);
        System.out.println();
        System.out.println("------------------------");
        System.out.println("enter your deposit");
        double deposit = sc4.nextDouble();
        System.out.println("enter your yearly%");
        int intereset = sc4.nextInt();
        System.out.println("enter your term");
        int term = sc4.nextInt();
        System.out.println("your deposit is " + deposit + "; your yearly % is " + intereset + "; your term is " + term);
        double yearsarray[] = new double[term];
        yearsarray[0]=deposit;
        for (int i = 1; i < yearsarray.length; i++) {
            yearsarray[i] = yearsarray[i-1] +(yearsarray[i-1]*intereset/100.0);
        }
        System.out.println("your yearly total amount will be ");
        for (int i = 0; i < yearsarray.length; i++) {
            System.out.print(yearsarray[i] + ", ");
        }
        double profitarray[] = new double[term];
        profitarray[0]=0;
        for (int i = 1; i < profitarray.length; i++) {
            profitarray[i] = yearsarray[i] -yearsarray[i-1];
        }
        System.out.println();
        System.out.println("your yearly profit will be ");
        for (int i = 0; i < profitarray.length; i++) {
            System.out.print(profitarray[i] + ", ");
        }
//       Problem 4,5,6
        Scanner sc5 = new Scanner(System.in);
        System.out.println();
        System.out.println("------------------------");
        System.out.println("enter your number");
        double number = sc5.nextDouble();
        if (number % 2 == 0) {
            System.out.println("your number is even");
        } else {
            System.out.println("your number is odd");
        }
        int y, n;
        boolean isComposite = false;
        for (y = 2; y < number; y++) {
            if (number % y == 0)
                isComposite = true;
            break;
        }
        if (isComposite) {
            System.out.println("composite number");
        } else {
            System.out.println("simple number");
        }
        System.out.println();
        System.out.println("dividers are:");
        for (n = 1; n <= number; n++) {
            if (number % n == 0)
                System.out.print(n + " ,");
        }
    }
}
