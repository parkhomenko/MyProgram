package com.OOP;

/**
 * Created by Mike on 11/20/2015.
 */
public class StudentNew extends Person {
    private int [] mark;

    public void setMark(int[] mark) {
        this.mark = mark;
    }
public StudentNew (){
    super(1);
    System.out.println();
}
//    @Override
////    можно вызывать методы родительского класса
//    public String getSurname() {
//        return super.getSurname();
//    }
}
