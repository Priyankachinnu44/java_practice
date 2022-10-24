import java.util.Scanner;
class Abc
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the total salary");
      int a=s.nextInt();
      int x=(a-800)/180;
      System.out.println("weekend hours is"+x);
      System.out.println("weekend hours is"+(10+x));
    }
  }