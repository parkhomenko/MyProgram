package com.OOP;


public class Group {
    private String name;
    private Student students[];

    public Group(int size) {
        students = new Student[size];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return students.length;
    }


    public void addStudent(Student st) {
        students[0] = st;
    }

    public void printGroup() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null)
                break;
            else
                students[i].printInfo();

        }
    }
}