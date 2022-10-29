import java.util.Scanner;
class Winner1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter age");
      int lastdigit=sc.nextInt();
      if(lastdigit%10==3||lastdigit%10==8)
      {
        System.out.println("lucky winner");  
      }
      else
      {
        System.out.println("Not a lucky winneer");  
 
      }
    }
  }