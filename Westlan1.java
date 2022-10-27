import java.util.Scanner;
class Westlan1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      int z=sc.nextInt();
      char a=sc.next().charAt(0);
      char b=sc.next().charAt(0);
      char c=sc.next().charAt(0);
      if((x==y&&y==z&&z==x)&&(a==b&&b==c&&c==a))
    System.out.println("Double Bonanza");
  else if((x==y&&y==z&&z==x))||(a==b&&b==c&&c==a))
        System.out.println("Bonanza");
      else
      System.out.println(" No Bonanza");
      
    }
  }