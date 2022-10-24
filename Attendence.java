import java.util.Scanner;
class Attendence
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Total number of attendees for trade fair");
      int t=sc.nextInt();
      int x=(2*t)/7;
      System.out.println("Day1 attendees"+x);
      System.out.println("Day2 attendees"+2x);
      System.out.println("Day3 attendees"+(x/2));
    }
  }