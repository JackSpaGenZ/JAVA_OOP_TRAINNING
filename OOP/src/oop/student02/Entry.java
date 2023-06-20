package oop.student02;

import java.util.Scanner;

class Student {
	String name;
    int age;

    public Student () {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
    }
    public void display () {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Entry {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            students[i].display();
        }
    }
}
