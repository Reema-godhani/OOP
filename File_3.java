public class pr 3
{
  public static void main(String[] args)
  {
    if(args.length!=2)
    {
      System.out.println("provide only two numbers");
      return;
    }
    Double num1=Double.parseDouble(args[0]);
    Double num2=Double.parseDouble(args[1]);
    Double sum=num1+num2;
    Double product=num1*num2;
    System.out.println("first num= "+num1);
    System.out.println("second num= "+num2);
    System.out.println("sum= "+sum);
    System.out.println("product= "+product);
  }
}
