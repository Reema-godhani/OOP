import java.util.*;
public class pr 2
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a five digit no ");
      int num=sc.nextInt();
      int result=0,place=1;
      while(10000<=num<=99999)
      {
        int digit=num%10;
        digit=(digit+1)%10;
        result+=digit*place;
        place*=10;
        num/=10;
      }
      System.out.println("new number "+result);
    }
  }
