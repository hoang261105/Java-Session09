package Bai9;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Mẫu số không thể bằng 0");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;

        return new Fraction(newNumerator, newDenominator);
    }

    public void simplify() {
        int a = Math.abs(this.numerator);
        int b = Math.abs(this.denominator);

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        numerator /= a;
        denominator /= a;

        if(denominator < 0){
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    public void display() {
        System.out.println(numerator + "/" + denominator);
    }
}
