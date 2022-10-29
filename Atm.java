import java.util.Scanner;
class Atm
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter ammount");
      int ammount=sc.nextInt();
      System.out.println("select the number\n1.withdraw\n2.deposit\n3.check balance\n4.exit");
      int num=sc.nextInt();
      Switch(num)
        {
case '1':
        System.out.println("enter ammount to withdraw");
        int a=sc.nextInt();
        ammount=ammount-a;
case '2':
System.out.println("enter ammount to deposit");
        int a=sc.nextInt();
        ammount=ammount+a;
        }
    }
  }