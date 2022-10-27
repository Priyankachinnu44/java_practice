import java.util.Scanner;
class Upper
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the character");
      char ch=sc.nextInt().charAt(0);
      if((ch>='A'&&ch<='Z'))||(ch>='a'&&ch<='z'))
        {
        System.out.println("Upper case");
        }
      else
      {
        System.out.println("lower case");
      }
    }
  }