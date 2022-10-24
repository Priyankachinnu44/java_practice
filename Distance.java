import java.util.Scanner;
class Distance
  {
    public static void main(String args[])
    { 
      Scanner Sc= new Scanner(System.in);
      int x1,x2,y1,y2;
      System.out.println("enter x1 value");
      x1=Sc.nextInt();
      System.out.println("enter x2 value");
      x2=Sc.nextInt();
      System.out.println("enter y1 value");
      y1=Sc.nextInt();
      System.out.println("enter y2 value");
      y2=Sc.nextInt();
      dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
      System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")+dis);
      
    }
  }