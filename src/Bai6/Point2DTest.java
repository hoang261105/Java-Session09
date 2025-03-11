package Bai6;

import java.util.Scanner;

public class Point2DTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point2D p1 = new Point2D(3, 4);
        Point2D p2 = new Point2D(6, 8);

        System.out.println("Điểm p1:");
        p1.displayPoint();

        System.out.println("Điểm p2:");
        p2.displayPoint();

        System.out.println("Khoảng cách giữa 2 điểm là: " + p1.distanceTo(p2));

        System.out.println("Nhập tọa độ x cua p1:");
        p1.setX(sc.nextDouble());

        System.out.println("Nhập tọa độ y cua p1:");
        p1.setY(sc.nextDouble());

        System.out.println("Khoảng cách giữa 2 điểm sau khi cap nhat là: " + p1.distanceTo(p2));
    }
}
