import java.util.Scanner;

class Point
{
    int x;
    int y;

    // Default constructor
    Point()
    {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    Point(int a, int b)
    {
        x = a;
        y = b;
    }

    // Copy constructor
    Point(Point p)
    {
        x = p.x;
        y = p.y;
    }

    
    void display()
    {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Default constructor
        Point p1 = new Point();
        System.out.print("Default constructor value: ");
        p1.display();
      
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter value of y: ");
        int y = sc.nextInt();

        // Parameterized constructor
        Point p2 = new Point(x, y);
        System.out.print("Parameterized constructor value: ");
        p2.display();

        // Copy constructor
        Point p3 = new Point(p2);
        System.out.print("Copy constructor value: ");
        p3.display();
    }
}

/*output 
Default constructor value: Point: (5, 5)
Enter value of x: 3
Enter value of y: 7
Parameterized constructor value: Point: (3, 7)
Copy constructor value: Point: (3, 7) */
