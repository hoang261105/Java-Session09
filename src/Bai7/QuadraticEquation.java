package Bai7;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public boolean hasRealRoot(){
        return getDiscriminant() >= 0;
    }

    public double getRoot1(){
        double delta = getDiscriminant();

        if(delta > 0){
            return (-b + Math.sqrt(delta)) / (2 * a);
        }else{
            return Double.NaN;
        }
    }

    public double getRoot2(){
        double delta = getDiscriminant();

        if(delta > 0){
            return (-b - Math.sqrt(delta)) / (2 * a);
        }else{
            return Double.NaN;
        }
    }

    public void display(){
        if(a == 0){
            System.out.println("Không phải phương trình bậc hai");
        }else if(hasRealRoot()){
            double root1 = getRoot1();
            double root2 = getRoot2();

            if(root1 == root2){
                System.out.println("Phuong trình có nghiệm kép là: " + root1);
            }else{
                System.out.println("Phương trình có 2 nghiệm thực");
                System.out.printf("x1 = %.2f, x2 = %.2f\n", root1, root2);
            }
        }else{
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
