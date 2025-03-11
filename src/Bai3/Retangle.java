package Bai3;

import java.util.Scanner;

public class Retangle {
    private double length;
    private double width;

    public Retangle() {
        this.length = 1;
        this.width = 1;
    }

    public Retangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void inputData(Scanner sc){
        System.out.println("Nhập chiều dài: ");
        this.length = sc.nextDouble();

        System.out.println("Nhập chiều rộng: ");
        this.width = sc.nextDouble();
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(double length, double width){
        return length * width;
    }

    public double getPerimeter(double length, double width){
        return (length + width) * 2;
    }

    public void display(){
        System.out.printf("Chiều dài: %.2fm - Chiều rộng: %.2fm\n", this.length, this.width);
        System.out.printf("Chu vi hình chữ nhật là: %.2fm\n", getPerimeter(this.length, this.width));
        System.out.printf("Diện tích hình chữ nhật là: %.2fm^2\n", getArea(this.length, this.width));
    }
}
