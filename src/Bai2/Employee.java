package Bai2;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.printf("Id: %d - Name: %s - Department: %s\n", this.id, this.name, this.department);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double increaseSalary(double percentage){
        return this.salary = this.salary * (1 + percentage / 100);
    }
}
