package ra;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khởi tạo đối tượng: ClassName objName = new Constructor(arg)
        // 1. Khởi tạo 1 doi tượng với các thông tin mặc định
        Student student1 = new Student();
        // 2. Khởi tạo đôi tượng sv2 với các thông tin sv là: SV002, Nguyen Văn B
        Student student2 = new Student("SV002", "Nguyen Van B");
        // 3. Khoi tạo đối tượng sv3 với các thong tin: SV003, Nguyễn Van C, 23, true, Hồ Chí Minh
        Student student3 = new Student("SV003", "Nguyen Van C", 23, true, "Ho Chí Minh");

        // 4. Nhập thông tin sinh viên 1
        student1.inputData(sc);

        // Sử dụng các phươngthuwuc setter dẻ nhap cac thong tin con lai
        System.out.println("Nhập vào thông tinh sv2");
        student2.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập giới tính");
        student2.setGender(Boolean.parseBoolean(sc.nextLine()));

        System.out.println("Nhập địa chỉ");
        student2.setAddress(sc.nextLine());

        // Cho sinh vien 3 tinh tong 2 so nguyen 10 va 20 va in ra man hinh
        System.out.println("Kết quả: " + student3.addTwoNumbers(10, 20));

        // 7. Tính tuổi trung bình của 3 sinh viên - Getter
        int avgAge = (student1.getAge() + student2.getAge() + student3.getAge()) / 3;
        System.out.println("Tuoi trung binh la: " + avgAge);
        // In thông tin sinh viên
        System.out.println("Thong tin sinh vien 1:");
        student1.displayStudent();

        System.out.println("Thong tin sinh vien 2:");
        student2.displayStudent();

        System.out.println("Thông tin sinh vien 3:");
        student3.displayStudent();
    }
}
