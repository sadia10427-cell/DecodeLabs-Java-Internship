import java.util.Scanner;

public class ATM {

    public ATM() {
        System.out.println("__________ Welcome to the ATM Interface __________\n");
    }

    public void displayMenu() {
        System.out.println("\nYou can select any operation from the following:");
        System.out.println("\t1. Display Balance");
        System.out.println("\t2. Deposit Amount");
        System.out.println("\t3. Withdraw Amount");
        System.out.println("\t4. Exit");
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        double amount;
        int choice;
        BankAccount account = new BankAccount(100.0); // Initial balance set to 100
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {
            atm.displayMenu();
            System.out.print("\nEnter the number of the operation you want to execute: ");
            
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("Invalid entry! Please enter a number.");
                sc.next(); // clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Your current Balance is: $" + account.displayBalance());
                    break;

                case 2:
                    System.out.print("Enter the amount you want to deposit: ");
                    if (sc.hasNextDouble()) {
                        amount = sc.nextDouble();
                        account.deposit(amount);
                    } else {
                        System.out.println("Invalid amount entered!");
                        sc.next();
                    }
                    break;

                case 3:
                    System.out.print("Enter the amount you want to withdraw: ");
                    if (sc.hasNextDouble()) {
                        amount = sc.nextDouble();
                        account.withdraw(amount);
                    } else {
                        System.out.println("Invalid amount entered!");
                        sc.next();
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM. Have a nice day!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid selection! Please pick between 1 and 4.");
            }
        }
        sc.close();
    }
}