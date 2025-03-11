package Bai4;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();

        circle.inputData(sc);

        circle.display();
    }
}
