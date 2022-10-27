import java.util.Scanner;
class Greatest
  {
    public static void main(String args[])
    {
      int num1,num2,large;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first number");
      num1=sc.nextInt();
      System.out.println("enter the second number");
      num2=sc.nextInt();
      if(num1>num2)
      {
        System.out.println("num1 is greatest");
      }
      else
      {
        System.out.println("num2 is greatest");
      }   
        
      
    }
  }