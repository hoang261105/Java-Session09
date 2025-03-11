package Bai8;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAcc1 = new BankAccount("23145991596", "PHAM PHUONG ANH", 50000000);
        BankAccount bankAcc2 = new BankAccount("19249244322", "HA HUYEN TRANG", 20000000);

        System.out.println("Thông tin tài khoản 1:");
        bankAcc1.display();

        System.out.println("Thông tin tài khoản 2:");
        bankAcc2.display();

        bankAcc1.deposit(1000000);
        System.out.printf("Số dư sau khi nạp thêm vào tk1 là: %.2f\n", bankAcc1.balance);

        bankAcc1.withdraw(1000000);
        System.out.printf("Số dư sau khi rút ra ở tk1 là: %.2f\n", bankAcc1.balance);

        bankAcc2.transfer(bankAcc1, 10000000);
        bankAcc1.display();
        bankAcc2.display();
    }
}
