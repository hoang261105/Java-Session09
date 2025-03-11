package Bai2;

public class Employeement {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Huyền", "Trưởng khoa", 200000);
        Employee employee2 = new Employee(2, "Phanh", "Giám đốc", 300000);

        System.out.println("Thông tin các nhân viên:");
        employee1.displayInfo();
        employee2.displayInfo();

        double newSalary1 = employee1.increaseSalary(20);
        System.out.printf("Lương của nhân viên 1 sau khi tăng thêm là: %.2f\n", newSalary1);

        double newSalary2 = employee2.increaseSalary(30);
        System.out.printf("Lương của nhân viên 2 sau khi tăng thêm là: %.2f\n", newSalary2);
    }
}
