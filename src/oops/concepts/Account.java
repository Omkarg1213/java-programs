package oops.concepts;

public class Account {
    int acc_no;
    String accHolderName;
    float amount;

    // Method to initialize object
    void insert(int acc_no, String accHolderName, float amount) {
        this.acc_no = acc_no;
        this.accHolderName = accHolderName;
        this.amount = amount;
    }

    // deposit method
    void deposit(float amount) {
        float deposit = this.amount + amount;
        System.out.println("Deposited: " + deposit);
    }

    // withdraw method
    void withdraw(float amount) {
        if (this.amount < amount) {
            System.out.println("Insufficient Balance");
        } else {
            this.amount = this.amount - amount;
            System.out.println(amount + " withdrawn");
        }
    }

    // method to check the balance of the account
    void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    void display() {
        System.out.println(acc_no + " " + accHolderName + " " + amount);
    }
}
