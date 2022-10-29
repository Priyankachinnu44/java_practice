import java.util.Scanner;
class Kingdom
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter age");
      int age=sc.nextInt();
      if(age>15)
      {
        System.out.println("Adult ticket");  
      }
      else
      {
        System.out.println("child ticket");  
 
      }
    }
  }