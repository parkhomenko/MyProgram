package com.Animal;

import java.util.*;
import java.util.concurrent.CompletableFuture;

/**
 * Created by Mike on 1/12/2016.
 */
public class App {
    public static void main(String[] args) {

        TreeMap <Integer,String>tree= new TreeMap();
        tree.put(1,"Cat");
        tree.put(2,"Dog");
        System.out.println(tree.get(2));


        Animal bob = new Dog(1, 2, 20, "white", "Bob", "Buldog 2 years", true, true);
        Animal bob1 = new Dog(2, 10, 20, "white", "Bob", "Buldog 10 years", true, true);
        Animal bob2 = new Dog(3, 3, 20, "black", "Bob", "Buldog 3 years", true, true);
        // bob.voice();
//        System.out.println();
        Cat puss = new Cat(2, 10, 20, "gray", "Barsik", "Pers", true);
//        puss.voice();
//        System.out.println();
        Wild giraffe = new Wild(3, 5, 100, "green", "Giraff", false);
//        giraffe.voice();
//        System.out.println();
        Wild croc = new Wild(4, 5, 100, "green", "Alligator", true);
//        croc.voice();
//        System.out.println();
//        Fish nemo=new Fish(1,2,3,"gold","Nemo",true);
//        nemo.voice();
//        Map<String, Animal> zoo = new HashMap();
//
//        int j=0;
//        for (int i = 0; i < 100000; i++) {
//            Animal bob3 = new Dog(i, i, i, "black", "Bob", "Buldog"+i, true, true);
//
//            zoo.put("1"+i, bob3);
//        }
//
//
//        for (int i = 0; i < 100; i++) {
//            double start = System.currentTimeMillis();
//            zoo.get("1" + 99990);
//            double stop = System.currentTimeMillis();
//
//
//           if(stop-start==1.0)  j++;
//
//        }
//        System.out.println(j);
//        List<Animal> arr = new ArrayList();
//        arr.add(bob);
//        arr.add(puss);
//        arr.add(giraffe);

//        for (Animal item:arr) {
//            item.voice();
//        }
List<Animal> zoo = new ArrayList<>();
        zoo.add(0,bob);
        zoo.add(1,bob1);
        zoo.add(2,bob2);

Collections.sort(zoo, new AgeComparator());

        for (Animal item: zoo) {

            System.out.println(item.phrase());
        }

        System.out.println("-------------");
        Collections.sort(zoo, new AgeReverseComparator<>(new AgeComparator()));

        for (Animal item: zoo) {

            System.out.println(item.phrase());
        }

    }

}
