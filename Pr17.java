import java.util.Scanner;

interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {

    public boolean isPassed(int mark) {
        return mark >= 35;
    }

    public String getDivision(double average) {
        if (average >= 60)
            return "First Division";
        else if (average >= 45)
            return "Second Division";
        else if (average >= 35)
            return "Pass Class";
        else
            return "Fail";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        System.out.print("Enter Marks: ");
        int mark = sc.nextInt();

        System.out.print("Enter Average: ");
        double avg = sc.nextDouble();

        System.out.println("Passed: " + r.isPassed(mark));
        System.out.println("Division: " + r.getDivision(avg));

        sc.close();
    }
}

/* output 
Enter Marks: 50
Enter Average: 68

Passed: true
Division: First Division */
