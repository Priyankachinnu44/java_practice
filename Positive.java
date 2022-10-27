import java.util.Scanner;
class Positive
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      int num=sc.nextInt();
      if(num>0)
      {
        System.out.println("number is positive");
      }
      else
      {
        System.out.println("not positive");
      }
    }
  }