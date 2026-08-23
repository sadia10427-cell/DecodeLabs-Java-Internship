public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double displayBalance() {
        return balance;
    }

    public void deposit(double b) {
        if (b < 0) {
            System.out.println("Error: Deposit amount cannot be negative!");
        } else if (b == 0) {
            System.out.println("Error: Deposit amount must be greater than zero!");
        } else {
            balance += b;
            System.out.println("Deposit successful!");
        }
    }

    public void withdraw(double b) {
        if (b < 0) {
            System.out.println("Error: Withdrawal amount cannot be negative!");
        } else if (b == 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero!");
        } else if (b > balance) {
            System.out.println("Error: Insufficient balance!");
        } else {
            balance -= b;
            System.out.println("Withdrawal successful!");
        }
    }
}
