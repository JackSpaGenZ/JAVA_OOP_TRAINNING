package oop.areaandperimeter;

import java.util.Scanner;

class Rectangle{
    double length;
    double width;

    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        width = sc.nextInt();
    }

    public double getArea(){
        return length * width;
    }
    public double getPerimeter () {
        return (length + width) * 2;
    }
    public void display (){
        System.out.println("Area: " + getArea());
        System.out.print("Perimeter: " + getPerimeter());
    }
}
public class Entry {
    public static void main(String[]args) {
        Rectangle r = new Rectangle();
        r.getInformation();
        r.display();
    }
}