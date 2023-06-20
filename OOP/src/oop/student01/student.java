package oop.student01;

import java.util.Scanner;

class infor {
    int id ;
    String name ;
    int age ;
    double point ;

    // CONSTRUCTOR
    public infor() {}
    public infor(String name) {
        this.name = name;
    }
    public infor(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public infor(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public infor(int id, String name, int age, Double point) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.point = point;
    }

    // GET INFOR
    public void getinfor() {
        System.out.println("Nhap thong tin cua sinh vien :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id cua sinh vien :");
        this.id = sc.nextInt();
        System.out.println("Nhap ten cua sinh vien :");
        this.name = sc.nextLine();
        System.out.println("Nhap tuoi cua sinh vien :");
        this.age = sc.nextInt();
        System.out.println("Nhap diem cua sinh vien :");
        this.point = sc.nextDouble();
    }

    public void showInfor() {
        System.out.println("Thong tin cua sinh vien :");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Point: " + this.point);

    }
}

class program {
    public void TitleHello(){
        System.out.println("XIN CHAO CAC BAN DA DEN VOI STUDENT TOOLS");
    }
}

public class student{
    public static void main(String[] args) {
        program pro01 = new program();
        infor std01 = new infor();
        pro01.TitleHello();
        std01.getinfor();
        std01.showInfor();
    }
}