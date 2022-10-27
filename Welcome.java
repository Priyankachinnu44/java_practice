import java.util.Scanner;
class Welcome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter age");
      int age=sc.nextInt();
      if(age>15)
      {
        System.out.println("welcome to the show");  
      }
      else
      {
        System.out.println("welcome to the show");  
 System.out.println("please note that you should be accompanied by an adult");  
 
      }
    }
  }