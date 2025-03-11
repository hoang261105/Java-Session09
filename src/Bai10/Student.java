package Bai10;

import java.util.Scanner;

public class Student {
    public enum Gender {
        MALE, FEMALE, OTHER;
    }

    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;

    public Student() {
    }

    public Student(int id, String name, int age, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void inputData(Scanner sc){
        System.out.println("Nhập id:");
        this.id = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập tên sinh viên:");
        this.name = sc.nextLine();

        System.out.println("Nhập tuổi:");
        this.age = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập giới tính:");
        this.gender = Gender.valueOf(sc.nextLine());

        System.out.println("Nhập địa chỉ:");
        this.address = sc.nextLine();

        System.out.println("Nhập số điện thoại:");
        this.phoneNumber = sc.nextLine();
    }

    public void displayStudent(){
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Address: " + this.address);
        System.out.println("Phone Number: " + this.phoneNumber);
    }
}
