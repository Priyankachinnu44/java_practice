import java.util.Scanner;
class Father
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter sub1 marks");
      int tel=sc.nextInt();
      System.out.println("enter sub2 marks");
      int eng=sc.nextInt();
      System.out.println("enter sub3 marks");
      int hindi=sc.nextInt();
      System.out.println("enter sub4 marks");
      int math=sc.nextInt();
       System.out.println("enter sub5 marks");
      int sci=sc.nextInt();
      int total=tel+eng+hindi+math+sci;
      int per=(total*100)/500;
      System.out.println("percentage of subjects:"+per+"%");
      if(per>=90)
      {
        System.out.println("father: how much grade you are expecting in final exam");
  System.out.println("son: dad i got"+per+"%");
  System.out.println("per+":excellent, i will buy for bike");
      }
      else if(per>=80)
      {
        System.out.println("father: how much grade you are expecting in final exam");
  System.out.println("son: dad i got"+per+"%");
          System.out.println("per+":excellent, i will buy for mobile");
      }
      else if
      System.out.println("father: how much grade you are expecting in final exam");
  System.out.println("son: dad i got"+per+"%");
          System.out.println(per+":worst,belt");
      
              
      }
    }
  }