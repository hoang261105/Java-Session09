package Bai8;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
        }else{
            System.out.println("Số tiền nạp không hợp lệ");
        }
    }

    public void withdraw(double amount){
        if(amount < balance){
            this.balance -= amount;
        }else{
            System.out.println("Số dư không đủ");
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (balance >= amount) {
            this.balance -= amount;
            recipient.deposit(amount);
            System.out.printf("Chuyển khoản thành công: %.2f\n", amount);
        } else if (recipient.balance >= amount) {
            this.balance += amount;
            recipient.withdraw(amount);
            System.out.printf("Chuyển khoản thành công: %.2f\n", amount);
        }else {
            System.out.println("Chuyển tiền không hợp lệ");
        }
    }

    public void display(){
        System.out.printf("Số tài khoản: %s\n", this.accountNumber);
        System.out.printf("Chủ tài khoản: %s\n", this.accountHolder);
        System.out.printf("Số dư: %.2f\n", this.balance);
    }
}
