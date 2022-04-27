import java.util.Scanner;

public class BankAccount {

    private String accHolder;
    private String accNumber;
    private String accType;
    private double accBalance;    

    BankAccount() {
        accInfo();
    }

    BankAccount(String name, String accNo, String type, double balance) {
        this.accHolder = name;
        this.accNumber = accNo;
        this.accType = type;
        this.accBalance = balance;
        accInfo();
    }

    public void accInfo() {
        System.out.println("\n----- XYZ Bank Welcomes You -----");
        System.out.println("-> Acount Holder Name : " + accHolder);
        System.out.println("-> Acount Number : " + accNumber);
        System.out.println("-> Acount Type : " + accType);
        System.out.println("-> Acount Balance : " + accBalance);
    }

    public void deposit(double amount) {
        this.accBalance += amount;
        System.out.println("New Balance : " + accBalance);
    }

    public void withdraw(double amount) {
        if(amount > this.accBalance) {
            System.out.println("\nYour balance is less than " + amount + "\tTransaction Failed...!!!");
            System.out.println("Current Balance : " + accBalance);
        }
        else {
            this.accBalance -= amount;
            System.out.println("New Balance : " + accBalance);
        }
    }

    public static void main(String[] args) {

        double amount;
        Scanner sc = new Scanner(System.in);
        BankAccount bk = new BankAccount();

        BankAccount acc1 = new BankAccount("Hari", "AC153416", "SAVINGS", 1000.0);

        System.out.print("\nEnter amount to depoit : ");
        amount = sc.nextDouble();
        acc1.deposit(amount);
        
        System.out.print("\nEnter amount to withdraw : ");
        amount = sc.nextDouble();
        acc1.withdraw(amount);

        BankAccount acc2 = new BankAccount("Anagha", "AC424616", "SAVINGS", 3500.0);

        System.out.print("\nEnter amount to depoit : ");
        amount = sc.nextDouble();
        acc2.deposit(amount);
        
        System.out.print("\nEnter amount to withdraw : ");
        amount = sc.nextDouble();
        acc2.withdraw(amount);
    }
}

