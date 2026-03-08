import java.util.Scanner;

class Rectangle
{
    double width = 1;
    double height = 1;

    // No argument constructor
    Rectangle()
    {
        width = 1;
        height = 1;
    }

    // Parameterized constructor
    Rectangle(double w, double h)
    {
        width = w;
        height = h;
    }

    // Method to find area
    double getArea()
    {
        return width * height;
    }

    // Method to find perimeter
    double getPerimeter()
    {
        return 2 * (width + height);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Rectangle r = new Rectangle(w, h);

        System.out.println("Area = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter());
    }
}


/* output 
 Enter width: 5
Enter height: 3
Area = 15.0
Perimeter = 16.0 */
