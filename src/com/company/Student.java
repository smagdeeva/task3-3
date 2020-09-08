package com.company;

public class Student {
    String firstName;
    String lastName;
    String group;
    public double averageMark;

    Aspirant test = new Aspirant();

    public void getScholarship() {
        int sum;

        if (averageMark == 5) {
            sum = 100;
        } else {
            sum = 80;
        }
        return;
    }

    Student[] StudentList = new Student[3];

    {
        for (int i = 0; i < StudentList.length; i++) {
            getScholarship();

        }


    }
}


