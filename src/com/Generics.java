package com;

import java.util.*;

/**
 * Created by Mike on 1/28/2016.
 */
public class Generics {
    public static void main(String[] args) {


        List <String> dogs = new ArrayList();
        dogs.add("Sam");
        dogs.add ("bnuch");
        for (String dog: dogs){
            System.out.println(dog);
        }
//        можно записывать в таком виде:
        Map<String, List<String>> map = new HashMap<>();

    }

     class Wraper<T>{
        private T obj;

        public  Wraper (T obj){

            this.obj=obj;
        }

    }
}