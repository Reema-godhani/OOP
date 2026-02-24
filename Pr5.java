import java.util.* ;
public class Trianglearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of a : ");
        double a = sc.nextDouble() ;
        System.out.println("Enter length of b : ");
        double b = sc.nextDouble();
        System.out.println("Enter length of c :");
        double c = sc.nextDouble();
        if(a+b > c && b+c > a && c+a > b){
            double s = (a + b + c) / 2 ;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c)) ;
            System.out.printf("Area of triangle is : %.2f", area);
        }
        else{
            System.out.println("Triangle is not possible with these sides");
        }
        sc.close();
    }
}


/*output
Enter length of a : 
3
Enter length of b : 
4
Enter length of c :
5
Area of triangle is : 6.00 */
