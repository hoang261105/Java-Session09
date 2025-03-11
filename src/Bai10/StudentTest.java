package Bai10;

import java.util.Scanner;

public class StudentTest {
    private static final int MAX_STUDENTS = 100;
    private static Student[] students = new Student[MAX_STUDENTS];
    private static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("-------------------MENU----------------");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên dựa vào mã sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.printf("Lựa chọn của bạn: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    displayStudent();
                    break;
                case 2:
                    addStudent(sc);
                    break;
                case 3:
                    updateStudent(sc);
                    break;
                case 4:
                    deleteStudent(sc);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại từ 1 đến 5");
            }
        }while (true);
    }

    public static void displayStudent(){
        if(count == 0){
            System.out.println("Danh sách sinh viên trống");
            return;
        }

        System.out.println("----------Danh sách sinh viên-----------");
        for(int i = 0; i < count; i++){
            students[i].displayStudent();
            System.out.println("-------------------------");
        }
    }

    public static void addStudent(Scanner sc) {
        if(count > MAX_STUDENTS) {
            System.out.println("Danh sách sinh viên đã đầy");
        }else{
            Student newStudent = new Student();

            newStudent.inputData(sc);
            students[count++] = newStudent;

            System.out.println("Thêm sinh viên thành công!");
        }
    }

    public static void updateStudent(Scanner sc) {
        if(count == 0){
            System.out.println("Danh sách sinh viên trống");
            return;
        }

        System.out.println("Nhập mã sinh viên cần sửa:");
        int studentId = sc.nextInt();

        for(int i = 0; i < count; i++){
            if(studentId == students[i].getId()){
                System.out.println("Nhập thông tin sinh viên mới:");
                students[i].inputData(sc);
                System.out.println("Cập nhật thông tin thành công!");
                return;
            }
        }

        System.out.println("Khong tìm thấy sinh viên");
    }

    public static void deleteStudent(Scanner sc) {
        if(count == 0){
            System.out.println("Danh sách sinh viên trống");
            return;
        }

        System.out.println("Nhập mã sinh viên cần xóa:");
        int studentId = sc.nextInt();

        for(int i = 0; i < count; i++){
            if(studentId == students[i].getId()){
                for(int j = 0; j < count - 1; j++){
                    students[j] = students[j+1];
                }
                students[count - 1] = null;
                count--;

                System.out.println("Xóa thông tin sinh viên thành công!");
                return;
            }
        }

        System.out.println("Khong tìm thấy sinh viên");
    }
}
