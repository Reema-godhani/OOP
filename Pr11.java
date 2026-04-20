import java.util.Scanner;

class College {
    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        String studentName;
        String course;

        void accept() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course Name: ");
            course = sc.nextLine();
        }

        void display() {
            System.out.println("\nAdmission Details");
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter College Name: ");
        String cname = sc.nextLine();

        College c = new College(cname);

        College.Admission a = c.new Admission();

        a.accept();
        a.display();
    }
}

/*output 
Enter College Name: ssasit
Enter Student Name: reema
Enter Course Name: CE

Admission Details
College Name: ssasit
Student Name: reema
Course: CE */
