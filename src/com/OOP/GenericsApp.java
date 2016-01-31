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
        for (int i = 0; i < array.length; i++) { //лучше испольовать переменную, чем еще раз вызывать array.length
            //не понятна сразу эта проверка, нужно вынести в отдельную функцию и назвать, что она делает
            if (firstNumber + secondNumber == N) {
                System.out.print("first number " + " " + firstNumber + " " + "second number = " + secondNumber);
                break; //если у тебя после цикла ничего нет, и ты сразу выходишь из функции, делай сразу return
            }
            //хорошо, что вынес в отдельную функцию
            if (checkN(array,N) ==true){ //проверка на true здесь лишняя, сама функция возвращает true или false (удали "== true")
                System.out.println("There are no such numbers");
                break; //лучше return вместо break
            }else if (N > array.length) { //лучше не использовать вложенные if, если можно обойтись

                firstNumber = array[i + 1];
            } else {
                secondNumber = array.length - i;
            }
        }
    }

    //checkN - поменяй название на более понятное, пусть лучше будет несколько слов, но они четко определяют что делает функция
    public static boolean checkN(int array[], int N){
        //слишком сложное выражение - замени на 2 функции, одна до ||, вторая - после
        return((array.length + (array.length - 1) < N)|| ((array[0] + array[1]) > N));


    }
}
