import java.util.Scanner;
class Si
  {
    public static void main(String args[])
    {
      int p,r,t;
      Scanner sc=new Scanner(System.in);
      System.out.println("principal ammount is:");
      p=sc.nextInt();
      System.out.println("rate of interest");
      r=sc.nextInt();
      System.out.println("time");
      t=sc.nextInt();
      double si=(p*r*t)/100;
     System.out.println("Simple Interest is:" +si);
    }
  }
