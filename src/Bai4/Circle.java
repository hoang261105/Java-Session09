package Bai4;

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void inputData(Scanner sc){
        System.out.println("Nhập 1 bán kính:");
        this.radius = sc.nextDouble();
    }

    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.printf("Hình tròn có bán kính là: %.2fm\n", this.radius);
        System.out.printf("Chu vi hình tròn là: %.2fm\n", getCircumference(this.radius));
        System.out.printf("Diện tích hình tròn là: %.2fm^2\n", getArea(this.radius));
    }
}
