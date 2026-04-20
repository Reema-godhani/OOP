import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited = " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn = " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Account Holder Name = " + accountHolderName);
        System.out.println("Balance = " + balance);
    }
}

class SavingAccount extends BankAccount {
    void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Interest = " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    void maturityAmount(int years) {
        double amount = balance + (balance * 0.06 * years);
        System.out.println("Maturity Amount after " + years + " years = " + amount);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingAccount s = new SavingAccount();
        FixedDepositAccount f = new FixedDepositAccount();

        System.out.println("Enter Saving Account Details");
        System.out.print("Account Number: ");
        int acc1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Account Holder Name: ");
        String name1 = sc.nextLine();
        System.out.print("Initial Balance: ");
        double bal1 = sc.nextDouble();

        s.openAccount(acc1, name1, bal1);
        s.deposit(2000);
        s.withdraw(1000);
        s.checkBalance();
        s.calculateInterest();

        System.out.println("\nEnter Fixed Deposit Account Details");
        System.out.print("Account Number: ");
        int acc2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Account Holder Name: ");
        String name2 = sc.nextLine();
        System.out.print("Deposit Amount: ");
        double bal2 = sc.nextDouble();

        f.openAccount(acc2, name2, bal2);
        f.checkBalance();
        f.maturityAmount(3);

        sc.close();
    }
}
/*output 
 Enter Saving Account Details
Account Number: 101
Account Holder Name: Reema
Initial Balance: 10000
Amount Deposited = 2000.0
Amount Withdrawn = 1000.0
Account Number = 101
Account Holder Name = Reema
Balance = 11000.0
Interest = 440.0

Enter Fixed Deposit Account Details
Account Number: 201
Account Holder Name: Amit
Deposit Amount: 50000
Account Number = 201
Account Holder Name = Amit
Balance = 50000.0
Maturity Amount after 3 years = 59000.0*/
