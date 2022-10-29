import java.util.Scanner;
class Gross
  {
    public static void main(String args[])
    {
      Scanner Sc=new Scanner(System.in);
      System.out.println("enter the basic:");
      int basic=Sc.nextInt();
      
      int hra=(12*basic)/100;
      
      int da=(20*basic)/100;
       
      int gs=basic+hra+da;
      System.out.println("gross salary is."+gs);
    }
  }