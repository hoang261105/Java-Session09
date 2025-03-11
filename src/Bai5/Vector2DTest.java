package Bai5;

public class Vector2DTest {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(1.0, 2.0);
        Vector2D v2 = new Vector2D(3.0, 4.0);

        System.out.println("Vector v1:");
        v1.displayVector();
        System.out.println("Vector v2:");
        v2.displayVector();

        System.out.println("Độ dài của v1 là: " + v1.calculateMagnitude());
        System.out.println("Độ dài của v2 là: " + v2.calculateMagnitude());

        Vector2D sum = v1.add(v2);
        System.out.println("Tổng v1+v2: ");
        sum.displayVector();

        Vector2D diff = v1.subtract(v2);
        System.out.println("Hieu v1 - v2: ");
        diff.displayVector();

        System.out.println("Tích vô hướng của 2 vector là: " + v1.dotProduct(v2));
    }
}
