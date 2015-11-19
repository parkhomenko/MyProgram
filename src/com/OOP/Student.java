package com.OOP;

public class Student {
    private String name;
    private String secondName;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Student(String name, String secondName, int age) {
        if (name.contains("0") || secondName.contains("2")) {
            System.out.println("Error name or second name contain numbers ");
        } else {
            this.name = name;
            this.secondName = secondName;
        }
if(age<=0){
    System.out.println("Error in age");
}else{
    this.age = age;
}

    }

    public void printInfo() {
        System.out.println("Student " + name + " " + secondName + " is" + age + " years old");
    }
public void canBuyBeer(){
    if (age>=18)
        System.out.println(name+""+secondName+" can buy beer");
    else
        System.out.println(name+""+secondName+" is too young to buy beer");
}
}
