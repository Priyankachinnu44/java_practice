import java.util.Scanner;
class Quadratic
  {
    public static void main(String args[])
    {
      int a,b,c,result;
      Scanner s=new Scanner(System.in);
      System.out.println("enter a value");
      a=s.nextInt();
      System.out.println("enter b value");
      b=s.nextInt();
      System.out.println("enter c value");
      c=s.nextInt();
      result=(b*b)-4*a*c;
      System.out.println(result);
      
    }
  }