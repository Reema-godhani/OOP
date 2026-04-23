import java.util.Scanner;

class VotingApp {

    void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VotingApp v = new VotingApp();

        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            v.checkEligibility(age);
        }

        catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Invalid Input");
        }

        finally {
            System.out.println("Validation process completed");
        }

        sc.close();
    }
}

/* output 
Enter Age: 16
Exception: Age must be 18 or above to vote
Validation process completed

Enter Age: 20
Eligible to vote
Validation process completed */
