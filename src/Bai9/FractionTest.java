package Bai9;

public class FractionTest {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(4, 8);
        Fraction fraction2 = new Fraction(10, 12);

        Fraction sum = fraction1.add(fraction2);
        Fraction diff = fraction1.subtract(fraction2);
        Fraction mult = fraction1.multiply(fraction2);
        Fraction div = fraction1.divide(fraction2);

        System.out.println("Tổng 2 phân số là: ");
        sum.display();
        System.out.println("Hiệu 2 phân số là: ");
        diff.display();
        System.out.println("Tích 2 phân số là: ");
        mult.display();
        System.out.println("Thương 2 phân số là: ");
        div.display();
    }
}
