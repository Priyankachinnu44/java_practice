import java.util.Scanner;
class Sumofodd3
  {
   
    public static void main(String args[])
    {
  Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
      int n=sc.nextInt();
      int sum=0;
      int i=1;
     do
        {
          if(i%2==1)
          {
           sum=sum+i;
          }
          i++;
        }while(i<=n);
      System.out.println(sum);
    }
  }
            