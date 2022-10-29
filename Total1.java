import java.util.Scanner;
class Total1
  {
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
      System.out.println("enter the amount");
      int amt=s.nextInt();
      if(amt%500==0)
      {
        System.out.println("number of 500 notes are"+amount/500);
      }
      else if(amt%200==0)
      {
        System.out.println("number of 200 notes are"+amt/200);
      }
      else if(amt%100==0)
      {
      System.out.println("number of 100 notes are"+amt/100);
      }  
      else
        System.out.println("invalid input");
      }
    }
  