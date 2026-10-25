import java.util.Scanner;

class BankAccount
{
    private double balance;

    public BankAccount(double balance)
    {
        if (balance < 0)
        {
            System.out.println("Initial balance can't be negative!!!");
            this.balance = 0;
        }
        else
        {
            this.balance = balance;
        }
    }

    public void deposit(double amount)
    {
        if (amount <= 0)
        {
            System.out.println("Deposit amount must be greater than 0!!!");
        }
        else
        {
            balance = balance + amount;
            System.out.println(amount + " deposited successfully.");
        }
    }

    public void withdraw(double amount)
    {
        if (amount <= 0)
        {
            System.out.println("Withdraw amount must be greater than 0!!!");
        }
        else if (amount > balance)
        {
            System.out.println("Insufficient balance!!!");
        }
        else
        {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }

    public void checkBalance()
    {
        System.out.println("Current balance: " + balance);
    }
}

public class Task_2
{
    static int readInt(Scanner sc)
    {
        while (!sc.hasNextInt())
        {
            System.out.print("Please enter a whole number: ");
            sc.next();
        }
        return sc.nextInt();
    }

    static double readDouble(Scanner sc)
    {
        while (!sc.hasNextDouble())
        {
            System.out.print("Please enter a valid number: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);
        int choice = 0;

        while (choice != 4)
        {
            System.out.println("\n--- Savings Account Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = readInt(sc);

            switch (choice)
            {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(readDouble(sc));
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(readDouble(sc));
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
