import java.util.Scanner;
class One
  {
  public static void main(String args)
    {
    Scanner sc=new Scanner(System.in);
      System.out.println("enter assignment score");
      int assignment=sc.nexInt();
System.out.println("enter mentor's score");
        int mentors=sc.nextInt();
System.out.println("enter C20 score"); 
      int C20=sc.nextInt();
      int total=assignment+mentors+C20;
      int percentage=(total/300)*100;
  percentage=(80/100 + 59/100 + 47/100)/300;
      if(assignment>=50 && mentors>=50 && C20>=50)
        int total=(70/100)*C20+(40/100)*assignment+(30/100)*mentors;
      if(total>=80)
      {
        System.out.println("ready for placement");
      }
      else if(total>=50)
      {
  System.out.println("may_be he's want to recap session");
      }
      else if
      {
        System.out.println("Not ready for placement he want to more time");
      }
      else if(assignment<50&&mentors>=50&&C20>=50)
        {
        System.out.println("he got result failed");
        }
    }  
  }
if(assignment>=70)
{
  System.out.println("assignment passed with good marks"+assignment);
}
else if(mentors>=50)
{
  System.out.println("mentors feedback is passed with good marks"+mentors);
}
else if(mentors>=90)
{
  System.out.println("C20 feedback is passed with good marks"+C20);
}
}
}