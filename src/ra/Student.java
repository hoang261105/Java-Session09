package ra;

import java.util.Scanner;

public class Student {
    /*
        Xây dựng lớp Sinh viên quản lí thông tin sinh viên gồm các thuộc tính
        1. Các thuộc tính
        - Mã sinh viên
        - Ten sinh viên
        - Tuổi sinh viên
        - Giơi tính
        - Địa chỉ
        2. Có 3 constructor không tham số, có 2 tham số mã sv, tên sv, có đầy đủ tham số
        3. Có các hành vi
        - Tính tổng 2 số nguyên
        - Chào giảng viên
        - Nhập thông tin sinh viên
        - Hiển thị thông tin sv
     */

    // 1. Fields | Properties | Attribute: Thuộc tính mô tả các đặc điểm của đối tượng trong thế giới thực
    // Syntax: private + datatype + attributeName

    private String studentId;
    private String studentName;
    private int age;
    private boolean gender;
    private String address;

    // 2. Constructor: Các hàm tạo giúp khởi tạo đối tượng từ lớp
    // Syntax: public + Classname (parameters)

    // Constructor default: 0 tham số khởi tạo đối tượng với các thuộc tính gia trị mặc định
    public Student() {

    }

    // Constructor 2 tham số khởi tạo đối tượng với mã sinh viên

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Constructor đầy đủ tham số để khởi tạo tất cả các thong tin cua 1 sinh vien

    public Student(String studentId, String studentName, int age, boolean gender, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    // 3. Methods mô tả các hành vi của đối tượng
    // Syntax : Access Modifier + returnData + methodName(param){Block}

    // 3.1 Getter và Setter

    // Getter: Lấy dữ liệu
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // 3.2 Method Behavior: Phuơng thuc hanh vi
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public void helloTeacher(){
        System.out.println("Hello Teacher");
    }

    public void inputData(Scanner sc){
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = sc.nextLine();

        System.out.println("Nhập tên sinh viên");
        this.studentName = sc.nextLine();

        System.out.println("Nhập vào tuổi:");
        this.age = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập vào giơới tính");
        this.gender = Boolean.parseBoolean(sc.nextLine());

        System.out.println("Nhập địa chỉ:");
        this.address = sc.nextLine();
    }

    public void addStudent(){

    }

    public void displayStudent(){
        System.out.println("Thong tin sinh vien");
        System.out.printf("Mã SV: %s - Tên sv: %s - Tuổi: %d\n", this.studentId, this.studentName, this.age);
        System.out.printf("Gioi tinh: %s - Địa chỉ: %s\n", this.gender ? "Nam" : "Nữ", this.address);
    }
}
