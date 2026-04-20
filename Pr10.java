import java.util.Scanner;

class BankAccount {
    String accountHolderName;
    double balance;
    static double interestRate = 5.0;

    BankAccount(String name, double bal) {
        accountHolderName = name;
        balance = bal;
    }

    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    void displayInterest() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
    }

    static void updateInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Balance: ");
        double bal = sc.nextDouble();

        BankAccount b1 = new BankAccount(name, bal);

        b1.displayInterest();

        System.out.print("\nEnter New Interest Rate: ");
        double newRate = sc.nextDouble();

        BankAccount.updateInterestRate(newRate);

        System.out.println("\nAfter Updating Interest Rate:");
        b1.displayInterest();

        sc.close();
    }
}

/*output 
Enter Account Holder Name: reema
Enter Balance: 20000
Account Holder: reema
Balance: 20000.0
Interest Earned: 1000.0

Enter New Interest Rate: 2

After Updating Interest Rate:
Account Holder: reema
Balance: 20000.0
Interest Earned: 400.0 */
  
